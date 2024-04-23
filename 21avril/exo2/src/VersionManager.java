import java.util.Stack;

public class VersionManager {
    private int major;
    private int minor;
    private int patch;
    private Stack<int[]> history;

    public VersionManager() {
        this("0.0.1");
    }

    public VersionManager(String initialVersion) {
        history = new Stack<>();
        if (initialVersion == null || initialVersion.isEmpty()) {
            initialVersion = "0.0.1";
        }
        parseVersion(initialVersion);
    }

    private void parseVersion(String version) {
        String[] parts = version.split("\\.");
        if (parts.length < 3) {
            String[] fullParts = new String[]{ "0", "0", "0" };
            System.arraycopy(parts, 0, fullParts, 0, parts.length);
            parts = fullParts;
        }

        try {
            major = Integer.parseInt(parts[0]);
            minor = Integer.parseInt(parts[1]);
            patch = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error occured while parsing version!");
        }
    }

    public VersionManager major() {
        history.push(new int[]{ major, minor, patch });
        major++;
        minor = 0;
        patch = 0;
        return this;
    }

    public VersionManager minor() {
        history.push(new int[]{ major, minor, patch });
        minor++;
        patch = 0;
        return this;
    }

    public VersionManager patch() {
        history.push(new int[]{ major, minor, patch });
        patch++;
        return this;
    }

    public VersionManager rollback() {
        if (history.isEmpty()) {
            throw new IllegalStateException("Cannot rollback!");
        }
        int[] previousVersion = history.pop();
        major = previousVersion[0];
        minor = previousVersion[1];
        patch = previousVersion[2];
        return this;
    }

    public String release() {
        return String.format("%d.%d.%d", major, minor, patch);
    }
}
