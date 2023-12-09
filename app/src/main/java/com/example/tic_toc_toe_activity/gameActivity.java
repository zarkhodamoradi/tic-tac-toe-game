package com.example.tic_toc_toe_activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
    Dialog dialog;
    EditText edtTextNameFirstPalyer;
    EditText edtTextNameSecondPlayer;
    Button btnConfirmNames;
    TextView txtCheckingNames;

    Dialog showWinState;
    TextView txtCongragulation;
    ImageView imgWinnerState;
    LinearLayout WinnerState;

    Button btnPositive;
    Button btnNegative;

    TextView txtCellWinner[] = new TextView[9];


    String firstPlayerName = "";
    String secondPlayerName = "";

    MediaPlayer acheiveMedia;


    int User = 0;
    int fix[] = new int[9];
    char content[] = new char[9];

    int countOWins = 0;
    int countXWins = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        dialog = new Dialog(gameActivity.this);
        showWinState = new Dialog(gameActivity.this);
        dialog.setContentView(R.layout.layout);
        showWinState.setContentView(R.layout.winner_state);
        SetUpView();
        getNames();


        acheiveMedia = MediaPlayer.create(this, R.raw.acheivesound);

        for (int i = 0; i < 9; i++) {
            fix[i] = 0;
        }


        for (int i = 0; i < 9; i++) {
            content[i] = (char) (i + 65);
        }
        whosTurn();

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
                    whosTurn();
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
                    whosTurn();
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
                    whosTurn();
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
                    whosTurn();
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
                    whosTurn();
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
                    whosTurn();
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
                    whosTurn();
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
                    whosTurn();
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
                    whosTurn();
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
                countOWins = 0;
                countXWins = 0;
                txtWinsOfO.setText("Player O : " + countOWins);
                txtWinsOfX.setText("Player X : " + countXWins);
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
        btnReset = findViewById(R.id.btnReset);
        txtWinsOfO = findViewById(R.id.txtWinsOfO);
        txtWinsOfX = findViewById(R.id.txtWinsOfX);
        edtTextNameFirstPalyer = dialog.findViewById(R.id.edtTextNameFirstPlayer);
        edtTextNameSecondPlayer = dialog.findViewById(R.id.edtTextNameSecondPlayer);
        btnConfirmNames = dialog.findViewById(R.id.btnConfirmNames);
        txtCheckingNames = dialog.findViewById(R.id.txtNameChecking);
        txtCongragulation = showWinState.findViewById(R.id.txtCongragulation);
        btnPositive = showWinState.findViewById(R.id.btnPositive);
        btnNegative = showWinState.findViewById(R.id.btnNegative);
        WinnerState = showWinState.findViewById(R.id.LinearLayoutWinnerState);
        txtCellWinner[0] = showWinState.findViewById(R.id.txtCellWinner1);
        txtCellWinner[1] = showWinState.findViewById(R.id.txtCellWinner2);
        txtCellWinner[2] = showWinState.findViewById(R.id.txtCellWinner3);
        txtCellWinner[3] = showWinState.findViewById(R.id.txtCellWinner4);
        txtCellWinner[4] = showWinState.findViewById(R.id.txtCellWinner5);
        txtCellWinner[5] = showWinState.findViewById(R.id.txtCellWinner6);
        txtCellWinner[6] = showWinState.findViewById(R.id.txtCellWinner7);
        txtCellWinner[7] = showWinState.findViewById(R.id.txtCellWinner8);
        txtCellWinner[8] = showWinState.findViewById(R.id.txtCellWinner9);


    }

    public void getNames() {
        dialog.setCancelable(false);
        btnConfirmNames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtTextNameFirstPalyer.getText().toString().equals("") &&
                        edtTextNameSecondPlayer.getText().toString().equals(""))
                    txtCheckingNames.setText("Please Enter names !!!");
                else if (edtTextNameFirstPalyer.getText().toString().equals(""))
                    txtCheckingNames.setText("Please Enter a name for player 1 !!!");
                else if (edtTextNameSecondPlayer.getText().toString().equals(""))
                    txtCheckingNames.setText("Please Enter a name for player 2 !!! ");
                else {
                    firstPlayerName = edtTextNameFirstPalyer.getText().toString();
                    secondPlayerName = edtTextNameSecondPlayer.getText().toString();
                    txtWinsOfO.setText(firstPlayerName + " (O) : 0");
                    txtWinsOfX.setText(secondPlayerName + " (X) : 0");
                    dialog.dismiss();
                }
            }
        });
        dialog.show();
    }

    public void ShowAlertDialog() {

        txtCellWinner[0].setText(txtCell1.getText());
        txtCellWinner[1].setText(txtCell2.getText());
        txtCellWinner[2].setText(txtCell3.getText());
        txtCellWinner[3].setText(txtCell4.getText());
        txtCellWinner[4].setText(txtCell5.getText());
        txtCellWinner[5].setText(txtCell6.getText());
        txtCellWinner[6].setText(txtCell7.getText());
        txtCellWinner[7].setText(txtCell8.getText());
        txtCellWinner[8].setText(txtCell9.getText());

        txtCellWinner[0].setTextColor(txtCell1.getTextColors());
        txtCellWinner[1].setTextColor(txtCell2.getTextColors());
        txtCellWinner[2].setTextColor(txtCell3.getTextColors());
        txtCellWinner[3].setTextColor(txtCell4.getTextColors());
        txtCellWinner[4].setTextColor(txtCell5.getTextColors());
        txtCellWinner[5].setTextColor(txtCell6.getTextColors());
        txtCellWinner[6].setTextColor(txtCell7.getTextColors());
        txtCellWinner[7].setTextColor(txtCell8.getTextColors());
        txtCellWinner[8].setTextColor(txtCell9.getTextColors());

        String user = "";

        if (User % 2 == 1) {

            user = firstPlayerName + " (O) ";
            countOWins++;
            txtWinsOfO.setText(firstPlayerName + " (O) : " + countOWins);
            txtCongragulation.setText("Congragulation " + firstPlayerName.toUpperCase() + " (O) !!!");

        } else {

            user = firstPlayerName + " (X) ";
            countXWins++;

            txtWinsOfX.setText(secondPlayerName + " (X) : " + countXWins);
            txtCongragulation.setText("Congragulation " + secondPlayerName.toUpperCase() + " (X) !!!");
        }
        showWinState.setCancelable(false);
        // builder.setCancelable(false);
        // builder.setMessage(user + "Won");
        btnPositive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

                showWinState.dismiss();
            }


        });
//        builder.setPositiveButton("Restrat", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                for (int i = 0; i < 9; i++) {
//                    fix[i] = 0;
//                }
//
//
//                for (int i = 0; i < 9; i++) {
//                    content[i] = (char) (i + 65);
//                }
//                txtCell1.setText("");
//                txtCell2.setText("");
//                txtCell3.setText("");
//                txtCell4.setText("");
//                txtCell5.setText("");
//                txtCell6.setText("");
//                txtCell7.setText("");
//                txtCell8.setText("");
//                txtCell9.setText("");
//            }
//        });
        btnNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
//        builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });
        acheiveMedia.start();
        // builder.show();
        showWinState.show();

    }

    public void CheckWinner() {

        for (int i = 0; i < 9; i++) {
            txtCellWinner[i].setBackgroundColor(getColor(R.color.specialBack));
        }
        try {
            if ((content[0] == content[1] && content[1] == content[2])) {
                txtCellWinner[0].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[1].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[2].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if ((content[3] == content[4] && content[4] == content[5])) {
                txtCellWinner[3].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[4].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[5].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if ((content[6] == content[7] && content[7] == content[8])) {
                txtCellWinner[6].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[7].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[8].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if ((content[0] == content[4] && content[4] == content[8])) {
                txtCellWinner[0].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[4].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[8].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if ((content[2] == content[4] && content[4] == content[6])) {
                txtCellWinner[2].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[4].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[6].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if ((content[0] == content[3] && content[3] == content[6])) {
                txtCellWinner[0].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[3].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[6].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if ((content[1] == content[4] && content[4] == content[7])) {
                txtCellWinner[1].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[4].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[7].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if ((content[2] == content[5] && content[5] == content[8])) {
                txtCellWinner[2].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[5].setBackgroundColor(getColor(R.color.light));
                txtCellWinner[8].setBackgroundColor(getColor(R.color.light));
                ShowAlertDialog();
            } else if (fix[0] == 1 && fix[1] == 1 && fix[2] == 1 && fix[3] == 1 && fix[4] == 1 && fix[5] == 1 && fix[6] == 1 && fix[7] == 1 && fix[8] == 1) {
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        acheiveMedia.release();
    }

    private void whosTurn() {
        if(User%2 ==0 ) {
            txtWinsOfO.setTextColor(getColor(R.color.winner));
            txtWinsOfX.setTextColor(getColor(R.color.white));
        }
        else {
            txtWinsOfX.setTextColor(getColor(R.color.winner));
            txtWinsOfO.setTextColor(getColor(R.color.white));
        }
    }
}