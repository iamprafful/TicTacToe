package in.shadowsoft.tictactoe;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.Snackbar;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Play extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_play);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
   // final Context context = this;
   // AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
    public static Button button1;
    public static Button button2;
    public static Button button3;
    public static Button button4;
    public static Button button5;
    public static Button button6;
    public static Button button7;
    public static Button button8;
    public static Button button9;
    int turn = 1;
    int move;
    int last;
    int[][] data= new int[3][3];

    void init() {
        turn=1;
        for (int i = 0; i <= 2; i++) {
            for (int y = 0; y <= 2; y++) {
                data[i][y] =2;
            }
        }
        button1= (Button) findViewById(R.id.b1);
        button2= (Button) findViewById(R.id.b2);
        button3= (Button) findViewById(R.id.b3);
        button4= (Button) findViewById(R.id.b4);
        button5= (Button) findViewById(R.id.b5);
        button6= (Button) findViewById(R.id.b6);
        button7= (Button) findViewById(R.id.b7);
        button8= (Button) findViewById(R.id.b8);
        button9= (Button) findViewById(R.id.b9);
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);

    }
    void result()
    {


            if (((data[0][0]==data[0][1])&&(data[0][1]==data[0][2])&&(data[0][0]==1))||((data[1][0]==data[0][1])&&(data[1][1]==data[1][2]&&(data[1][0]==1)))||((data[2][0]==data[2][1])&&(data[2][1]==data[2][2])&&(data[2][0]==1))||((data[0][0]==data[1][0])&&(data[1][0]==data[2][0])&&(data[0][0]==1))||((data[0][1]==data[1][0])&&(data[1][1]==data[2][1])&&(data[0][1]==1))||((data[0][2]==data[1][2])&&(data[2][1]==data[2][2])&&(data[0][2]==1))||((data[0][0]==data[1][1])&&(data[1][1]==data[2][2])&&(data[0][0]==1))||((data[0][2]==data[1][1])&&(data[1][1]==data[2][0])&&(data[0][2]==1)))
            {


                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("Player X won!\nDo you want to play again?")
                            .setCancelable(false);
                    builder.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                init();
                                dialog.cancel();
                            }
                        });
                    builder.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                finish();
                                System.exit(0);
                            }
                        });

                    //Creating dialog box
                    AlertDialog alert = builder.create();
                    //Setting the title manually
                    alert.setTitle("result");
                    alert.show();

            }

        else if (((data[0][0]==data[0][1])&&(data[0][1]==data[0][2])&&(data[0][0]==0))||((data[1][0]==data[0][1])&&(data[1][1]==data[1][2]&&(data[1][0]==0)))||((data[2][0]==data[2][1])&&(data[2][1]==data[2][2])&&(data[2][0]==0))||((data[0][0]==data[1][0])&&(data[1][0]==data[2][0])&&(data[0][0]==0))||((data[0][1]==data[1][0])&&(data[1][1]==data[2][1])&&(data[0][1]==0))||((data[0][2]==data[1][2])&&(data[2][1]==data[2][2])&&(data[0][2]==0))||((data[0][0]==data[1][1])&&(data[1][1]==data[2][2])&&(data[0][0]==0))||((data[0][2]==data[1][1])&&(data[1][1]==data[2][0])&&(data[0][2]==0)))
        {


            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Player O won")
                    .setCancelable(false);
            builder.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            init();
                            dialog.cancel();
                        }
                    });
            builder.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            finish();
                            System.exit(0);
                        }
                    });
            //Creating dialog box
            AlertDialog alert = builder.create();
            //Setting the title manually
            alert.setTitle("result");
            alert.show();

        }




    }
    public void NewGame(View v) {
        init();
        Snackbar.make(v, "X will start", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public void buttonOnClick1(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =1;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
         data[0][0]=move;
          result();
    }

    public void buttonOnClick2(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =2;
        data[0][1]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    public void buttonOnClick3(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =3;
        data[0][2]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    public void buttonOnClick4(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =4;
        data[1][0]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    public void buttonOnClick5(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =5;
        data[1][1]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    public void buttonOnClick6(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =6;
        data[1][2]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    public void buttonOnClick7(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =7;
        data[2][0]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    public void buttonOnClick8(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =8;
        data[2][1]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    public void buttonOnClick9(View v) {
        Button button = (Button) v;
        if (turn == 1) {
            ((Button) v).setText("X");
            v.setClickable(false);
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=1;
            turn = 0;
        } else {
            ((Button) v).setText("O");
            v.setClickable(false);
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            move=0;
            turn = 1;
        }
        last =9;
        data[2][2]=move;
        button1 = (Button) findViewById(R.id.undo);
        button1.setClickable(true);
        result();
    }
    int x= 2;
    public void undo(View v) {
        Button button = (Button) v;
       // Button button1 = (Button) findViewById(R.id.b1);
        v.setClickable(false);
        if (turn==0)
        {
            turn=1;
            Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        else
        {
            turn=0;
            Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
        switch (last)
        {
            case 1:
                button1 = (Button) findViewById(R.id.b1);
                button1.setText("");
                button1.setClickable(true);
                data[0][0]=x;
                break;
            case 2:
                button1 = (Button) findViewById(R.id.b2);
                button1.setText("");
                button1.setClickable(true);
                data[0][1]=x;
                break;
            case 3:
                button1 = (Button) findViewById(R.id.b3);
                button1.setText("");
                button1.setClickable(true);
                data[0][2]=x;
                break;
            case 4:
                button1 = (Button) findViewById(R.id.b4);
                button1.setText("");
                button1.setClickable(true);
                data[1][0]=x;
                break;
            case 5:
                button1 = (Button) findViewById(R.id.b5);
                button1.setText("");
                button1.setClickable(true);
                data[1][1]=x;
                break;
            case 6:
                button1 = (Button) findViewById(R.id.b6);
                button1.setText("");
                button1.setClickable(true);
                data[1][2]=x;
                break;
            case 7:
                button1 = (Button) findViewById(R.id.b7);
                button1.setText("");
                button1.setClickable(true);
                data[2][0]=x;
                break;
            case 8:
                button1 = (Button) findViewById(R.id.b8);
                button1.setText("");
                button1.setClickable(true);
                data[2][1]=x;
                break;
            case 9:
                button1 = (Button) findViewById(R.id.b9);
                button1.setText("");
                button1.setClickable(true);
                data[2][2]=x;
                break;
            default:
                v.setClickable(true);
                if (turn==0)
                {
                    turn=1;
                    Snackbar.make(v, "Now X turn", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                else
                {
                    turn=0;
                    Snackbar.make(v, "Now O turn", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }

        }
    }
    @Override
    public void onStart() {
        super.onStart();
          init();
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Play Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://in.shadowsoft.tictactoe/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Play Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://in.shadowsoft.tictactoe/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
