import java.util.Arrays;

public class Perceptron {
	private int threshold;
	private double learning_rate;
	private int[] weights;
	private int bias;
	
	public Perceptron()
	{
		threshold = 100;
		learning_rate = 0.01;
		weights = new int[1];
		bias = 0;
		
		System.out.println("Initial weights: " + Arrays.toString(weights));
		System.out.println("Initial bias: " + bias);
		System.out.println("Threshold: " + threshold);
		System.out.println("Learning rate: " + learning_rate + "\n");
	}
	
	public Perceptron(int no_of_inputs, int thres, double rate)
	{
		threshold = thres;
		learning_rate = rate;
		weights = new int[no_of_inputs];
		bias = 0;
		
		System.out.println("Initial weights: " + Arrays.toString(weights));
		System.out.println("Initial bias: " + bias);
		System.out.println("Threshold: " + threshold);
		System.out.println("Learning rate: " + learning_rate + "\n");
	}
	
	public int predict(int[] inputs)
	{
		int z = bias;
		
		// Dot product
		for (int i = 0; i < inputs.length; i++)
			z += inputs[i] * weights[i];
		
		System.out.println("z = " + inputs[0] + "*" + weights[0] + "+" + inputs[1] + "*" + weights[1] + "=" + z);
		
		// Activation
		if (z > 0)
			return 1;
		else
			return 0;
	}
	
	public void train(int[][] training_inputs, int[] labels)
	{
		// Class used to "zip" training_inputs, labels
		class InputsLabels
		{
			private int[] inputs;
			private int label;
			public InputsLabels(int[] a, int b) {inputs=a; label=b;}
		    public int[] getInputs() {return inputs;}
		    public int getLabel() {return label;}
		}
		
		InputsLabels[] inputsLabels = new InputsLabels[labels.length];
		
		// Use the constructor of each object to "zip"
		for (int a = 0; a < inputsLabels.length; a++)
		{
			inputsLabels[a] = new InputsLabels(training_inputs[a], labels[a]);
		}
		
		for (int i = 1; i <= threshold; i++)
		{
			System.out.println("--------- Training Iteration: " + i + " -----------");
			for (InputsLabels a : inputsLabels)
			{
				System.out.println("Current inputs, weights, bias: " + Arrays.toString(a.getInputs()) + " " + Arrays.toString(weights) + " " + bias);
				
				int yhat = predict(a.getInputs());
				System.out.println("Activation(yhat) = " + yhat);
				
				int error = a.getLabel() - yhat;
				System.out.println("Error = " + a.getLabel() + "-" + yhat + "=" + error);
				
				// += to each element in the weights
				for (int j = 0; j < weights.length; j++)
					weights[j] += learning_rate * error * a.getInputs()[j];
				bias += learning_rate * error;
				System.out.println("Updated Weights: " + Arrays.toString(weights));
				System.out.println("Updated Bias: " + bias + "\n");
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		int[][] input_matrix = new int[4][];
		
		// 2-input And gate truth table
		int[] labels = {1, 0, 0, 0}; // output
		input_matrix[0] = new int[]{1, 1}; // input combinations
		input_matrix[1] = new int[]{1, 0};
		input_matrix[2] = new int[]{0, 1};
		input_matrix[3] = new int[]{0, 0};
		
		// 2-input or gate truth table
		//int[] labels = {1, 1, 1, 0}; // output
		//input_matrix[0] = new int[]{1, 1}; // input combinations
		//input_matrix[1] = new int[]{1, 0};
		//input_matrix[2] = new int[]{0, 1};
		//input_matrix[3] = new int[]{0, 0};
		
		// 2-input nand gate truth table
		//int[] labels = {0, 1, 1, 1}; // output
		//input_matrix[0] = new int[]{1, 1}; // input combinations
		//input_matrix[1] = new int[]{1, 0};
		//input_matrix[2] = new int[]{0, 1};
		//input_matrix[3] = new int[]{0, 0};
		
		// 2-input xor gate truth table
		//int[] labels = {0, 1, 1, 0}; // output
		//input_matrix[0] = new int[]{1, 1}; // input combinations
		//input_matrix[1] = new int[]{1, 0};
		//input_matrix[2] = new int[]{0, 1};
		//input_matrix[3] = new int[]{0, 0};
		
		// Construct Perceptron object (num of inputs, threshold, learning rate)
		Perceptron perceptron = new Perceptron(2, 10, 1);
		
		// Train the network
		perceptron.train(input_matrix, labels);
		
		// Test the network
		int a = 1;
		int b = 1;
		int[] inputs = new int[]{a, b};
		
		System.out.println("--------- Input ---------" + Arrays.toString(inputs));
		int output = perceptron.predict(inputs);
		System.out.println("--------- Output --------" + output);
    }
}
