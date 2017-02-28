package main;

import main.Fft.*;

public class Main {
	public static void main(String[] args) {  
		int N = 8;//Integer.parseInt(args[0]);
        Complex[] x = new Complex[N];

        // original data
        for (int i = 0; i < N; i++) 
        {
            x[i] = new Complex(i, 0);
            x[i] = new Complex(-2 * Math.random() + 1, 0);
        }
        Fft.Complex.show(x, "x");

        // FFT of original data
        Complex[] y = Fft.Complex.fft(x);
        Fft.Complex.show(y, "y = fft(x)");

        // take inverse FFT
        Complex[] z = Fft.Complex.ifft(y);
        Fft.Complex.show(z, "z = ifft(y)");
          
    } 
}