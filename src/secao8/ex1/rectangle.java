package secao8.ex1;

public class rectangle {
        double width, height;

        public double Area(){
            return width * height;
        }
        public double Perimeter(){
            return 2*(width+height);
        }
        public double Diagonal() {
            return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        }

        public String toString(){
            return "Area" + Area()+
                    "Perimeter" + Perimeter()+
                    "Diagonal" + Diagonal();
        }
}
