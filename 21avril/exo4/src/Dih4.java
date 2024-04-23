public class Dih4{
    private Transform transform;
    public Dih4(Transform transform){
        this.transform = transform;
    }
    public Dih4 then(Dih4 dih4){
        return new Dih4(this.transform.then(dih4.transform));
    }
    public Dih4 inv(){
        return new Dih4(this.transform.inv());
    }
    public boolean equals(Dih4 dih4){
        return (this.transform == dih4.transform);
    }
    public String toString() {
        return this.transform.name();
    }
}