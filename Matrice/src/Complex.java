public class Complex {
    private int real;
    private int imag;

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public int getReal() {
        return real;
    }
    public int getImag() {
        return imag;
    }

    public void setReal(int real) {
        this.real = real;
    }
    public void setImag(int imag) {
        this.imag = imag;
    }

    public String toString() {
        if (imag >= 0) {
            return real + "+" + imag + "i";
        } else {
            return real + "" + imag + "i";
        }
    }

    public void adunare (Complex a){
        this.real += a.real;
        this.imag += a.imag;

    }
    public void scadere (Complex a){
        this.real -= a.real;
        this.imag -= a.imag;
    }
    public void inmultireCuScalar (int a){
        this.real *= a;
        this.imag *= a;
    }
    public void inmultire(Complex a) {
        int newReal = this.real * a.real - this.imag * a.imag;
        int newImag = this.real * a.imag + this.imag * a.real;
        this.real = newReal;
        this.imag = newImag;
    }
}



