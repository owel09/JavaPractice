    package SoloLearn.Constructor;

    public class FunctionOverload {

        private String color;

        public FunctionOverload () {
            color = "Red";
        }

        public FunctionOverload (String color){
            this.color = color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public static void main(String[] args) {
            FunctionOverload car = new FunctionOverload();
            System.out.println("Constructor without parameter where the color is " + car.color);


            FunctionOverload bike = new FunctionOverload("Green");
            System.out.println("Constructor with parameter where the color is " + bike.color);

            car.setColor("Blue");
            System.out.println("Setter and Getter updates where the color is " + car.getColor());

            bike.setColor("Yellow");
            System.out.println("Setter and Getter updates where the color is " + bike.getColor());
        }

    }
