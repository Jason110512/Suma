 class Suma {
    private int x,y;
    private int evaluar;
    
    public int mostrarResultado() {
        return this.x+this.y;
    }
    @Override
    public String toString() {
        return "Suma [x=" + x + ", y=" + y + ", evaluar=" + evaluar + "]";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getEvaluar() {
        return evaluar;
    }

    public void setEvaluar(int evaluar) {
        this.evaluar = evaluar;
    }

   
}