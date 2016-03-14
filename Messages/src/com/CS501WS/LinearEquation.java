package com.CS501WS;

public class LinearEquation {
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0;

	public LinearEquation() {

	}

	public LinearEquation(double x1, double y1, double x2, double y2,
			double x3, double y3, double x4, double y4) {

		seta(y1 - y2);
		setb(-(x1 - x2));
		setc(y3 - y4);
		setd(-(x3 - x4));
		sete((y1 - y2) * x1 - (x1 - x2) * y1);
		setf((y3 - y4) * x3 - (x3 - x4) * y3);
	}

	public double getx() {
		double x;
		x = ((gete() * getd()) - getb() * getf()) / ((geta() * getd()) - (getb() * getc()));
		return x;
	}

	public double gety() {
		double y;
		y = ((geta() * getf()) - getc() * gete()) / ((geta() * getd()) - (getb() * getc()));
		return y;
	}

	public boolean isSolvable() {
		if ((geta() * getd() - getb() * getc()) == 0) {
			errorMessage = "The Equation has no solution, the lines are parrallel or overlapping";
			return false;
		}
		return true;
	}

	public double geta() {
		return a;
	}

	public double getb() {
		return b;
	}

	public double getc() {
		return c;
	}

	public double getd() {
		return d;
	}

	public double gete() {
		return e;
	}

	public double getf() {
		return f;
	}

	public double seta(double _a) {
		a = _a;
		return a;
	}

	public double setb(double _b) {
		b = _b;
		return b;
	}

	public double setc(double _c) {
		c = _c;
		return c;
	}

	public double setd(double _d) {
		d = _d;
		return d;
	}

	public double sete(double _e) {
		e = _e;
		return e;
	}

	public double setf(double _f) {
		f = _f;
		return f;
	}

	private String errorMessage = "";

	public String getErrorMessage() {
		return errorMessage;
	}

}
