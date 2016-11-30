package metaClickerPrototype;

import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Clicker extends JFrame {

	private double counter;
	private double lifetimeCounter;

	public Clicker() {
		counter = 0;
		lifetimeCounter = 0;
	}

	public void click() {
		counter++;
		lifetimeCounter++;
	}

	public double getCounter() {
		return counter;
	}
	
	public double getLifetimeCounter() {
		return this.lifetimeCounter;
	}
	
	public boolean removeClicks(int num) {
		if (counter > num) {
			counter = counter - num;
			return true;
		}
		else
			return false;
	}

//	public static void main(String[] args) {
//		ClickingWindow electionrigger = new ClickingWindow();
//	}

}
