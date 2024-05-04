# Ex.No:4 To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## AIM:

To create a two screens , first screen will take one number input from user. After click on Factorial button, second screen will open and it should display factorial of the same number using Explicit Intents.


## EQUIPMENTS REQUIRED:

Latest Version Android Studio

## ALGORITHM:
Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as ExplicitIntent and click Next.

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml and activity_main.xml.

Step 6: Display message give in MainActivity and MainActivity2 file.

Step 7: Save and run the application.


## PROGRAM:
```
/*
Program to print the text “ExplicitIntent”.
Developed by: Don Bosco Blaise A
Registeration Number : 212221040045
*/
```
## activity.xml:
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <EditText
        android:id="@+id/numberEditText1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="172dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:minHeight="48dp"
        android:text=""
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="LabelFor,TextFields,SpeakableTextPresentCheck"
        android:autofillHints="" />

    <Button
        android:id="@+id/factorialButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="340dp"
        android:text="Button"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="HardcodedText" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
## activity_main2.xml:
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout        xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity2">

    <TextView
        android:id="@+id/factorialTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="283dp"
        android:text="TextView"
        android:textSize="36sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        tools:ignore="HardcodedText" />
</androidx.constraintlayout.widget.ConstraintLayout>
```
## MainActivity.java:
```
package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText numberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEditText = findViewById(R.id.numberEditText1);
        Button factorialButton = findViewById(R.id.factorialButton);

        factorialButton.setOnClickListener(v -> {
            int number = Integer.parseInt(numberEditText.getText().toString());

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("number", number);
            startActivity(intent);
        });
    }
}
```
## MainActivity2.java:
```
package com.example.explicitintent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView factorialTextView = findViewById(R.id.factorialTextView);

        Intent intent = getIntent();
        int number = intent.getIntExtra("number", 0);

        long factorial = calculateFactorial(number);
        factorialTextView.setText("Factorial of " + number + " is " + factorial);
    }

    private long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
```  

## OUTPUT
![Screenshot (218)](https://github.com/DonBoscoBlaiseA/ExplicitIntent-MAD/assets/140850829/c0155712-00fe-4bb2-8205-f65f9d988c31)
![Screenshot (219)](https://github.com/DonBoscoBlaiseA/ExplicitIntent-MAD/assets/140850829/3c6ad549-b978-41fa-add3-be63d28f8351)
![Screenshot (220)](https://github.com/DonBoscoBlaiseA/ExplicitIntent-MAD/assets/140850829/2536824d-3f77-4e57-952f-1623a1e52728)
![Screenshot (221)](https://github.com/DonBoscoBlaiseA/ExplicitIntent-MAD/assets/140850829/ec1a1e33-9436-458c-948a-0a4eec61c96d)
![OutP1](https://github.com/DonBoscoBlaiseA/ExplicitIntent-MAD/assets/140850829/26232e0a-f703-41c2-a979-329e5c0fb6dd)
![OutP2](https://github.com/DonBoscoBlaiseA/ExplicitIntent-MAD/assets/140850829/4c209f1c-5f2f-40c7-b1fc-1def7d302db9)
![OutP3](https://github.com/DonBoscoBlaiseA/ExplicitIntent-MAD/assets/140850829/57077bd1-ebc8-4598-81e9-1791f0280238)


## RESULT
Thus a Simple Android Application create a Explicit Intents using Android Studio is developed and executed successfully.


