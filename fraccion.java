public class fraccion implements Ifraccion{

        private int num;
        private int den;
        
    
        public fraccion(int num, int den) {
            this.num = num;
            this.den = den;
        }


        public fraccion() {
            num = den= 0;
        }


        public int getNum() {
            return num;
        }


        public void setNum(int num) {
            this.num = num;
        }


        public int getDen() {
            return den;
        }


        public void setDen(int den) {
            this.den = den;
        }

    @Override
    public String toString(){
        return "[" + num + "/" + den +"]";
    }

    @Override

    public fraccion suma (fraccion fraccion1, fraccion fraccion2){
        return new fraccion(
            (fraccion1.getNum() + fraccion2.getNum()),
            (fraccion1.getDen() + fraccion2.getDen()));
    }

    @Override

    public fraccion resta (fraccion fraccion1, fraccion fraccion2){
        return new fraccion(
            (fraccion1.getNum() - fraccion2.getNum()),
            (fraccion1.getDen() - fraccion2.getDen()));
    }

    @Override

    public fraccion multiplicacion (fraccion fraccion1, fraccion fraccion2){
        return new fraccion(
            (fraccion1.getNum() * fraccion2.getNum()),
            (fraccion1.getDen() * fraccion2.getDen()));
    }


    @Override

    public fraccion division (fraccion fraccion1, fraccion fraccion2){
        return new fraccion(
            (fraccion1.getNum() / fraccion2.getNum()),
            (fraccion1.getDen() / fraccion2.getDen()));
    }
}