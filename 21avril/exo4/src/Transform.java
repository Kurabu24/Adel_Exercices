// enum class stock only constant
public enum Transform {
    // Create Constants for the transformation
    IDENTITY,
    ROTATE_90_ANTICLOCKWISE,
    ROTATE_180,
    ROTATE_90_CLOCKWISE,
    REFLECT_VERTICAL,
    REFLECT_FORWARD_DIAGONAL,
    REFLECT_HORIZONTAL,
    REFLECT_REVERSE_DIAGONAL;
    // get type of transformation
    public boolean isRotation(){
        return (this.ordinal() < 4);
    }
    public boolean isReflexion(){
        return !isRotation();
    }
    // return the inversion of transformation : only 2 and 4 changes 
    public Transform inv(){
        if (this.isRotation()) {
            return (this.ordinal() == 1 ) ? ROTATE_90_CLOCKWISE:(this.ordinal() == 3 )?ROTATE_90_ANTICLOCKWISE:this ;
        }
        return this;
    }
    public Transform then(Transform other){
        if(this.ordinal() >= 4 ^ other.ordinal() >= 4){
            int newTransform = ((this.ordinal() + other.ordinal()) % 4) + 4;
            return Transform.values()[newTransform];
        }
        if(this.isRotation() && other.isRotation()){
            int RotatedOrdinal = (this.ordinal() + other.ordinal()) % 4;
            return Transform.values()[RotatedOrdinal];
        }
        else{
            int absolute = Math.abs(this.ordinal() - other.ordinal());
            return Transform.values()[absolute % 4];
        }
    }
    
}
