<h1>Temperature Recommendation</h1>

  <p>This is a simple Java program that prompts the user to enter a temperature and provides recommendations based on the input.</p>

  <h2>Usage</h2>
  <ol>
    <li>Make sure you have Java installed on your system.</li>
    <li>Compile the program using the following command:</li>
    <pre><code>javac Main.java</code></pre>
    <li>Run the program using the following command:</li>
    <pre><code>java Main</code></pre>
    <li>Enter the temperature when prompted and press Enter.</li>
    <li>The program will provide a recommendation based on the entered temperature.</li>
  </ol>

  <h2>Program Explanation</h2>
  <ol>
    <li>Imports the necessary <code>Scanner</code> class from the <code>java.util</code> package.</li>
    <li>Defines a <code>Main</code> class.</li>
    <li>Defines the <code>main</code> method as the entry point of the program.</li>
    <li>Creates a <code>Scanner</code> object to read user input from the console.</li>
    <li>Prompts the user to enter the temperature.</li>
    <li>Reads the user's input as an integer and assigns it to the <code>temp</code> variable.</li>
    <li>Uses conditional statements to provide a recommendation based on the temperature:
      <ul>
        <li>If the temperature is less than 5, it suggests going skiing.</li>
        <li>If the temperature is between 5 and 15 (inclusive), it suggests going to the cinema.</li>
        <li>If the temperature is between 15 and 25 (inclusive), it suggests going for a picnic.</li>
        <li>If the temperature is greater than 25, it suggests going swimming.</li>
      </ul>
    </li>
    <li>Prints the corresponding recommendation based on the temperature.</li>
  </ol>

  <p>Feel free to modify the program or the temperature ranges to suit your needs.</p>

  <h2>License</h2>
  <p>This project is licensed under the <a href="LICENSE">MIT License</a>. Feel free to use and modify the code as per your requirements.</p>

  <p>Please note that this is a simple example and may not cover all possible scenarios or edge cases.</p>
