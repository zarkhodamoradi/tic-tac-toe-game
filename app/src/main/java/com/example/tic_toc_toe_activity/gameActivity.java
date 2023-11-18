package com.example.tic_toc_toe_activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class gameActivity extends AppCompatActivity {
    TextView txtCell1;
    TextView txtCell2;
    TextView txtCell3;
    TextView txtCell4;
    TextView txtCell5;
    TextView txtCell6;
    TextView txtCell7;
    TextView txtCell8;
    TextView txtCell9;
    Button btnReset;
    TextView txtWinsOfO;
    TextView txtWinsOfX;

    int User = 0;
    int fix[] = new int[9];
    char content[] = new char[9];

    int countOWins =0 ;
    int countXWins = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        SetUpView();

        for (int i = 0; i < 9; i++) {
            fix[i] = 0;
        }


        for (int i = 0; i < 9; i++) {
            content[i] = (char) (i + 65);
        }

        //        try{}catch(Exception ex){}
        txtCell1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[0] == 0) {
                    if (User % 2 == 0) {
                        txtCell1.setText("O");
                        txtCell1.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell1.setText("X");
                        txtCell1.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[0]++;
                    try {
                        content[0] = txtCell1.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }
            }
        });
        txtCell2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[1] == 0) {
                    if (User % 2 == 0) {
                        txtCell2.setText("O");
                        txtCell2.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell2.setText("X");
                        txtCell2.setTextColor(getColor(R.color.blue));

                    }
                    User++;
                    fix[1]++;
                    try {
                        content[1] = txtCell2.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }

            }
        });
        txtCell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[2] == 0) {
                    if (User % 2 == 0) {
                        txtCell3.setText("O");
                        txtCell3.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell3.setText("X");
                        txtCell3.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[2]++;
                    try {
                        content[2] = txtCell3.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }

            }
        });
        txtCell4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[3] == 0) {
                    if (User % 2 == 0) {
                        txtCell4.setText("O");
                        txtCell4.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell4.setText("X");
                        txtCell4.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[3]++;
                    try {
                        content[3] = txtCell4.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }

            }
        });
        txtCell5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[4] == 0) {
                    if (User % 2 == 0) {
                        txtCell5.setText("O");
                        txtCell5.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell5.setText("X");
                        txtCell5.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[4]++;
                    try {
                        content[4] = txtCell5.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }

            }
        });
        txtCell6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[5] == 0) {
                    if (User % 2 == 0) {
                        txtCell6.setText("O");
                        txtCell6.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell6.setText("X");
                        txtCell6.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[5]++;
                    try {
                        content[5] = txtCell6.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }


            }
        });
        txtCell7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[6] == 0) {
                    if (User % 2 == 0) {
                        txtCell7.setText("O");
                        txtCell7.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell7.setText("X");
                        txtCell7.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[6]++;
                    try {
                        content[6] = txtCell7.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }

            }
        });
        txtCell8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[7] == 0) {
                    if (User % 2 == 0) {
                        txtCell8.setText("O");
                        txtCell8.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell8.setText("X");
                        txtCell8.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[7]++;
                    try {
                        content[7] = txtCell8.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }

            }
        });
        txtCell9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (fix[8] == 0) {
                    if (User % 2 == 0) {
                        txtCell9.setText("O");
                        txtCell9.setTextColor(getColor(R.color.red));
                    } else {
                        txtCell9.setText("X");
                        txtCell9.setTextColor(getColor(R.color.blue));
                    }
                    User++;
                    fix[8]++;
                    try {
                        content[8] = txtCell9.getText().toString().charAt(0);
                    } catch (Exception ex) {
                    }
                    CheckWinner();
                }

            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 9; i++) {
                    fix[i] = 0;
                }


                for (int i = 0; i < 9; i++) {
                    content[i] = (char) (i + 65);
                }
                countOWins = 0 ;
                countXWins = 0 ;
                txtWinsOfO.setText("Player O : "+countOWins);
                txtWinsOfX.setText("Player X : "+countXWins);
                txtCell1.setText("");
                txtCell2.setText("");
                txtCell3.setText("");
                txtCell4.setText("");
                txtCell5.setText("");
                txtCell6.setText("");
                txtCell7.setText("");
                txtCell8.setText("");
                txtCell9.setText("");
            }

        });
//        try{
//            content[0] = txtCell1.getText().toString().charAt(0);
//            content[1] = txtCell2.getText().toString().charAt(0);
//            content[2] = txtCell3.getText().toString().charAt(0);
//            content[3] = txtCell4.getText().toString().charAt(0);
//            content[4] = txtCell5.getText().toString().charAt(0);
//            content[5] = txtCell6.getText().toString().charAt(0);
//            content[6] = txtCell7.getText().toString().charAt(0);
//            content[7] = txtCell8.getText().toString().charAt(0);
//            content[8] = txtCell9.getText().toString().charAt(0);
//        }catch(Exception ex){}


    }

    public void SetUpView() {
        txtCell1 = findViewById(R.id.txtCell1);
        txtCell2 = findViewById(R.id.txtCell2);
        txtCell3 = findViewById(R.id.txtCell3);
        txtCell4 = findViewById(R.id.txtCell4);
        txtCell5 = findViewById(R.id.txtCell5);
        txtCell6 = findViewById(R.id.txtCell6);
        txtCell7 = findViewById(R.id.txtCell7);
        txtCell8 = findViewById(R.id.txtCell8);
        txtCell9 = findViewById(R.id.txtCell9);
        btnReset= findViewById(R.id.btnReset);
        txtWinsOfO = findViewById(R.id.txtWinsOfO);
        txtWinsOfX = findViewById(R.id.txtWinsOfX);

    }

    public void ShowAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(gameActivity.this);
        builder.setTitle("Congratulation!!!");
        String user = "";
        builder.setIcon(android.R.drawable.star_big_on);
        if (User % 2 == 1) {
            user = "Player Number 1(O) ";
            countOWins++;
            txtWinsOfO.setText("Player O : "+countOWins);

        }
        else {
            user = "Player Number 2(X) ";
            countXWins++;
            txtWinsOfX.setText("Player X : "+countXWins);
        }
        builder.setCancelable(false);
        builder.setMessage(user + "Won");
        builder.setPositiveButton("Restrat", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                for (int i = 0; i < 9; i++) {
                    fix[i] = 0;
                }


                for (int i = 0; i < 9; i++) {
                    content[i] = (char) (i + 65);
                }
                txtCell1.setText("");
                txtCell2.setText("");
                txtCell3.setText("");
                txtCell4.setText("");
                txtCell5.setText("");
                txtCell6.setText("");
                txtCell7.setText("");
                txtCell8.setText("");
                txtCell9.setText("");
            }
        });
        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        builder.show();

    }

    public void CheckWinner() {

        try {
            if ((content[0] == content[1] && content[1] == content[2])) {
                ShowAlertDialog();
            }
            else if ((content[3] == content[4] && content[4] == content[5])) {
                ShowAlertDialog();
            }
           else if ((content[6] == content[7] && content[7] == content[8])) {
                ShowAlertDialog();
            }
           else if ((content[0] == content[4] && content[4] == content[8])) {
                ShowAlertDialog();
            }
           else if ((content[2] == content[4] && content[4] == content[6])) {
                ShowAlertDialog();
            }
           else if ((content[0] == content[3] && content[3] == content[6])) {
                ShowAlertDialog();
            }
           else if ((content[1] == content[4] && content[4] == content[7])) {
                ShowAlertDialog();
            }
           else if ((content[2] == content[5] && content[5] == content[8])) {
                ShowAlertDialog();
            }
           else if(fix[0]==1 && fix[1]==1 && fix[2]==1 && fix[3]==1 && fix[4]==1&& fix[5]==1&& fix[6]==1&& fix[7]==1&& fix[8]==1){
                AlertDialog.Builder builder = new AlertDialog.Builder(gameActivity.this);
                builder.setTitle("");
                builder.setMessage("DRAW");
                builder.setPositiveButton("Restrat", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for (int i = 0; i < 9; i++) {
                            fix[i] = 0;
                        }


                        for (int i = 0; i < 9; i++) {
                            content[i] = (char) (i + 65);
                        }
                        txtCell1.setText("");
                        txtCell2.setText("");
                        txtCell3.setText("");
                        txtCell4.setText("");
                        txtCell5.setText("");
                        txtCell6.setText("");
                        txtCell7.setText("");
                        txtCell8.setText("");
                        txtCell9.setText("");
                    }
                });
                builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.show();

            }
        } catch (Exception ex) {
        }

    }


}