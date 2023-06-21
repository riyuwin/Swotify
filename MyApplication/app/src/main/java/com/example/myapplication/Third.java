package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Third extends AppCompatActivity {
    MediaPlayer mySong;
    MediaPlayer myRideHome;
    MediaPlayer mySunflower;
    MediaPlayer myUmaarawUmuulan;
    MediaPlayer myPaperRings;
    public String songTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        mySong = MediaPlayer.create(Third.this, R.raw.fallen);
        myRideHome = MediaPlayer.create(Third.this, R.raw.ride_home);
        mySunflower = MediaPlayer.create(Third.this, R.raw.sunflower);
        myUmaarawUmuulan = MediaPlayer.create(Third.this, R.raw.umaaraw_umuulan);
        myPaperRings = MediaPlayer.create(Third.this, R.raw.paper_rings);

        TextView SongTitleView = findViewById(R.id.song_title3);
        TextView AuthorTitleView = findViewById(R.id.author3);
        TextView LyricsTitleView = findViewById(R.id.ride_home_lyrics);
        ImageView imageViewPlaceHolder = findViewById(R.id.imageView2);

        Button btn = findViewById(R.id.download_btn);
        btn.setOnClickListener(view -> {
            createNotif();
        });

        Intent intent = getIntent();

        //String selected_song = intent.getStringExtra("Title");
        int selected_song = intent.getIntExtra("Title", 0);


        if (selected_song == 1){
            songTitle = "Fallen";
            imageViewPlaceHolder.setImageResource(R.drawable.fallen_cover); //BRAIN
            SongTitleView.setText("Fallen");
            AuthorTitleView.setText("Lola Amour");
            LyricsTitleView.setText("What if I told you that I've fallen \n\n\n" +
                    "    And I like the way you say my name? \n\n\n" +
                    "    My heart skips a beat when I hear you calling  \n\n\n" +
                    "    And I like that it won't go away  \n\n\n" +
                    "    But never mind, don't wanna give you any trouble \n\n\n" +
                    "    Never mind, never mind \n\n\n" +
                    "    I'm OK with being by your side for as long as I can hide \n\n\n" +
                    "    What if I told you that I've fallen? \n\n\n" +
                    "    What if I told you that I\'ve fallen? \n\n\n" +
                    "    The heart-shaped arrow through my chest \n\n\n" +
                    "    I'll make your breakfast every morning \n\n\n" +
                    "    And pick you up when you're a mess \n\n\n" +
                    "    But I know that it won't ever stop \n\n\n" +
                    "    You know I'll be there when you call me whether you like it or not \n\n\n" +
                    "    Without a warning, now I'm falling for this picture on my phone \n\n\n" +
                    "    But don't mind me, I'm just falling, I'll be back up on my own \n\n\n" +
                    "    Please don't say my name, help me put out this flame \n\n\n" +
                    "    I'd rather hold onto this feeling that you don't even believe in \n\n\n" +
                    "    What if I told you that I've fallen? \n\n\n" +
                    "    What if I told you that I've fallen? \n\n\n" +
                    "    Nevermind, nevermind, nevermind \n\n\n" +
                    "    What if I told you that I've fallen? \n\n\n" +
                    "    Nevermind, nevermind, nevermind \n\n\n" +
                    "    What if I told you that I've fallen? \n\n\n" +
                    "    Nevermind, nevermind, nevermind \n\n\n" +
                    "    What if I told you that I've fallen? \n\n\n" +
                    "    Nevermind, nevermind, nevermind \n\n\n" +
                    "    What if I told you that I've fallen? (Nevermind) \n\n\n" +
                    "    What if I told you that I've fallen? (Oh, nevermind) \n\n\n" +
                    "    What if I told you that I've fallen? (Oh, nevermind) \n\n\n" +
                    "    What if I told you that I've fallen? (Oh, nevermind, I said nevermind) \n\n\n" +
                    "    I shouldn't tell you that I've fallen \n\n\n ");

        } else if (selected_song == 2){
            songTitle = "Ride Home";
            imageViewPlaceHolder.setImageResource(R.drawable.ride_home_cover); //BRAIN
            SongTitleView.setText("Ride Home");
            AuthorTitleView.setText("Ben and Ben");
            LyricsTitleView.setText("Took a morning ride to the place\n\n\n" +
                    "    Where you and I were supposed to meet\n\n\n" +
                    "    The city yawns, they echo on\n\n\n" +
                    "    My thoughts are spinning on and on my head\n\n\n" +
                    "    It seems, they lead me back to you, ooh\n\n\n" +
                    "    I keep coming back to you\n\n\n" +
                    "    Took a morning ride, found a place up in my mind\n\n\n" +
                    "    No one else can see\n\n\n" +
                    "    Maybe, it's fate that we lose control\n\n\n" +
                    "    In circles around, we go\n\n\n" +
                    "    We become who we ought to know\n\n\n" +
                    "    We just gotta let it go\n\n\n" +
                    "    We just gotta let it go\n\n\n" +
                    "    So, I'm coming home to you, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\\n\\n\n" +
                    "    You, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\n\n\n" +
                    "    You're all I need, the very air I breathe\n\n\n" +
                    "    You are home, home\n\n\n" +
                    "    Took a morning ride, gotta leave this all behind\n\n\n" +
                    "    For with you is where I want to be\n\n\n" +
                    "    Maybe, it's fate that we can't control (fate that we can't control)\n\n\n" +
                    "    Oh, around and around, it goes ('round and around, it goes)\n\n\n" +
                    "    And all that we seem to know (all that we seem to know)\n\n\n" +
                    "    We just gotta let it go\n\n\n" +
                    "    We just gotta let it go\n\n\n" +
                    "    So, I'm coming home to you, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\n\n\n" +
                    "    You, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\n\n\n" +
                    "    You're all I need, the very air I breathe\n\n\n" +
                    "    You are home, home\n\n\n" +
                    "    So many questions I've thrown to the skies\n\n\n" +
                    "    And all of the answers, I've found in your eyes\n\n\n" +
                    "    When I'm with you, home is never too far\n\n\n" +
                    "    And my weary heart has come to rest in yours\n\n\n" +
                    "    I found my way home\n\n\n" +
                    "    I found my way home\n\n\n" +
                    "    I found my way home\n\n\n" +
                    "    I found my way home\n\n\n" +
                    "    I found my way home, I found my way home\n\n\n" +
                    "    I found my way home, I found my way home\n\n\n" +
                    "    I found my way home, I found my way home\n\n\n" +
                    "    I found my way home\n\n\n" +
                    "    So, I'm coming home to you, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\n\n\n" +
                    "    You, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\n\n\n" +
                    "    You're all I need, the very air I breathe\n\n\n" +
                    "    You are home, home\n\n\n" +
                    "    Coming home to you, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\n\n\n" +
                    "    You, ooh-ooh, ooh-ooh-ooh-ooh-ooh-ooh\n\n\n" +
                    "    You're all I need, the very air I breathe\n\n\n" +
                    "    You are home\n\n\n");
        }   else if (selected_song == 3) {
            songTitle = "Sunflower";
            imageViewPlaceHolder.setImageResource(R.drawable.sunflower_cover); //BRAIN
            SongTitleView.setText("Sunflower");
            AuthorTitleView.setText("Post Malone");
            LyricsTitleView.setText("Eh, eh, eh, eh (Ooh)\n\n\n" +
                    "Uh, uh, uh, uh (Uh)\n\n\n" +
                    "Eh, eh\n\n\n" +
                    "Uh uh, some things you just can't refuse\n\n\n" +
                    "She wanna ride me like a cruise and I'm not tryna lose\n\n\n" +
                    "Then you're left in the dust, unless I stuck by ya\n\n\n" +
                    "You're a sunflower, I think your love would be too much\n\n\n" +
                    "Or you'll be left in the dust, unless I stuck by ya\n\n\n" +
                    "You're the sunflower, you're the sunflower\n\n\n" +
                    "Yo no sé lo que tú tienes\n\n\n" +
                    "Cómo hace' lo que quiera' con mi vida, tú te vas y luego vienes\n\n\n" +
                    "Yo no sé qué tiene' tú, pero a la ve' yo pienso que no me convienes\n\n\n" +
                    "A veces trato de buscar una salida, rápido tú me detienes\n\n\n" +
                    "Así de loco tú me quieres\n\n\n" +
                    "Pero soy un loco por ti\n\n\n" +
                    "Tú no sabe' lo que por dentro yo siento por ti\n\n\n" +
                    "Y por má' que no quiero verte, vuelvo a repetir\n\n\n" +
                    "Y sentir cada parte de tu cuerpo cuando estas aquí\n\n\n" +
                    "No te puedo mentir\n\n\n" +
                    "Siempre estoy buscándote, yeah-yey\n\n\n" +
                    "Trato de alejarme y tú acercándote, yeah-yey\n\n\n" +
                    "De lo que nos pasa siempre culpándote, yeah-yey\n\n\n" +
                    "Pero se me olvida cuando te veo desnudándote\n\n\n" +
                    "Y no sé por qué\n\n\n" +
                    "And you'll be left in the dust, unless I stuck by ya\n\n\n" +
                    "You're the sunflower, I think your love would be too much\n\n\n" +
                    "Or you'll be left in the dust, unless I stuck by ya\n\n\n" +
                    "You're the sunflower, you're the sunflower\n\n\n" +
                    "Ese día que te conocí\n\n\n" +
                    "No sabía que iba a ser así\n\n\n" +
                    "El girasol más lindo del jardín\n\n\n" +
                    "Y verte en el amanecer\n\n\n" +
                    "Con un beso volví a caer\n\n\n" +
                    "Dime a dónde se fue, a dónde se fue\n\n\n" +
                    "Y ahora me quedo con la confusión\n\n\n" +
                    "Con sentimientos de amor y dolor\n\n\n" +
                    "Te juro que esa no fue mi intención\n\n\n" +
                    "La flor de antes cambió de color\n\n\n" +
                    "Uh-uh-uh-uuh\n\n\n" +
                    "En mi vida solo existes tú\n\n\n" +
                    "Baby, tell what we trynna prove\n\n\n" +
                    "Si tú sabes que yo soy tu luz (Si tú sabes que yo soy tu luz)\n\n\n" +
                    "And you'll be left in the dust, unless I stuck by ya\n\n\n" +
                    "You're the sunflower, es que tu amor es just too much\n\n\n" +
                    "Or you'll be left in the dust, unless I stuck by ya\n\n\n" +
                    "You're the sunflower, you're the sunflower\n\n\n");

        }   else if (selected_song == 4) {
            songTitle = "Umaaraw Umuulan";
            imageViewPlaceHolder.setImageResource(R.drawable.umaaraw_umuulan_cover); //BRAIN
            SongTitleView.setText("Umaaraw Umuulan");
            AuthorTitleView.setText("December Avenue");
            LyricsTitleView.setText("Hindi mo maintindihan\n\n\n" +
                    "Kung ba't ikaw ang napapagtripan\n\n\n" +
                    "Ng halik ng kamalasan\n\n\n" +
                    "Ginapang mong marahan ang hagdanan\n\n\n" +
                    "Para lamang makidlatan\n\n\n" +
                    "Sa kaitaas-taasan ngunit\n\n\n" +
                    "Kaibigan\n\n\n" +
                    "Huwag kang magpapasindak\n\n\n" +
                    "Kaibigan\n\n\n" +
                    "Easy lang sa iyak\n\n\n" +
                    "Dahil wala ring mangyayari\n\n\n" +
                    "Tayo'y walang mapapala\n\n\n" +
                    "Wag mong pigilan ang pagbuhos ng ulan\n\n\n" +
                    "May panahon para maging hari\n\n\n" +
                    "May panahon para madapa\n\n\n" +
                    "Dahil ang buhay natin ay sadyang ganyan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Ang buhay ay sadyang ganyan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Wag kang maawa sa iyong sarili\n\n\n" +
                    "Isipin na wala ka nang silbi\n\n\n" +
                    "'Sang dambuhalang kalokohan\n\n\n" +
                    "Bukas sisikat ding muli ang araw\n\n\n" +
                    "Ngunit para lang sa may tiyagang\n\n\n" +
                    "Maghintay\n\n\n" +
                    "Kaya't kaibigan\n\n\n" +
                    "Wag kang magpapatalo\n\n\n" +
                    "Kaibigan\n\n\n" +
                    "Itaas ang noo (yeah)\n\n\n" +
                    "Dahil wala ring mangyayari\n\n\n" +
                    "Tayo'y walang mapapala\n\n\n" +
                    "Wag mong pigilan ang pagbuhos ng ulan\n\n\n" +
                    "May panahon para maging hari\n" +
                    "May panahon para madapa\n\n\n" +
                    "Dahil ang buhay natin ay sadyang ganyan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Ang buhay ay sadyang ganyan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Dahil wala ring mangyayari\n\n\n" +
                    "Tayo'y walang mapapala\n\n\n" +
                    "Wag mong pigilan ang pagbuhos ng ulan\n\n\n" +
                    "May panahon para maging hari\n\n\n" +
                    "May panahon para madapa\n\n\n" +
                    "Dahil ang buhay natin ay sadyang ganyan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Umaaraw umuulan\n\n\n" +
                    "Ang buhay ay sadyang ganyan\n\n\n" +
                    "Umaaraw umuulan\n\n\n");

        }   else if (selected_song == 5) {
            songTitle = "Paper Rings";
            imageViewPlaceHolder.setImageResource(R.drawable.paper_rings_cover); //BRAIN
            SongTitleView.setText("Paper Rings");
            AuthorTitleView.setText("Taylor Swift");
            LyricsTitleView.setText("The moon is high\n\n\n" +
                    "Like your friends were the night that we first met\n\n\n" +
                    "Went home and tried to stalk you on the internet\n\n\n" +
                    "Now I've read all of the books beside your bed\n\n\n" +
                    "The wine is cold\n\n\n" +
                    "Like the shoulder that I gave you in the street\n\n\n" +
                    "Cat and mouse for a month or two or three\n\n\n" +
                    "Now I wake up in the night and watch you breathe\n\n\n" +
                    "Kiss me once 'cause you know I had a long night\n\n\n" +
                    "(Oh!) Kiss me twice 'cause it's gonna be alright\n\n\n" +
                    "Three times 'cause I've waited my whole life\n\n\n" +
                    "(One, two, one two three four!)\n\n\n" +
                    "I like shiny things, but I'd marry you with paper rings\n\n\n" +
                    "Uh huh, that's right\n\n\n" +
                    "Darling, you're the one I want, and\n\n\n" +
                    "I hate accidents except when we went from friends to this\n\n\n" +
                    "Uh huh, that's right\n\n\n" +
                    "Darling, you're the one I want\n\n\n" +
                    "In paper rings, in picture frames, in dirty dreams\n\n\n" +
                    "Oh, you're the one I want\n\n\n" +
                    "In the winter, in the icy outdoor pool\n\n\n" +
                    "When you jumped in first, I went in too\n\n\n" +
                    "I'm with you even if it makes me blue\n\n\n" +
                    "Which takes me back\n\n\n" +
                    "To the color that we painted your brother's wall\n\n\n" +
                    "Honey, without all the exes, fights, and flaws\n\n\n" +
                    "We wouldn't be standing here so tall, so\n\n\n" +
                    "Kiss you once 'cause I know you had a long night\n\n\n" +
                    "(Oh!) Kiss you twice 'cause it's gonna be alright\n\n\n" +
                    "Three times 'cause you waited your whole life\n\n\n" +
                    "(One, two, one two three four!)\n\n\n" +
                    "I like shiny things, but I'd marry you with paper rings\n\n\n" +
                    "Uh huh, that's right\n\n\n" +
                    "Darling, you're the one I want, and\n\n\n" +
                    "I hate accidents except when we went from friends to this\n\n\n" +
                    "Uh huh, that's right\n\n\n" +
                    "Darling, you're the one I want\n\n\n" +
                    "In paper rings, in picture frames, in dirty dreams\n\n\n" +
                    "Oh, you're the one I want\n\n\n" +
                    "I want to drive away with you\n\n\n" +
                    "I want your complications too\n\n\n" +
                    "I want your dreary Mondays\n\n\n" +
                    "Wrap your arms around me, baby boy\n\n\n" +
                    "I want to drive away with you\n\n\n" +
                    "I want your complications too\n\n\n" +
                    "I want your dreary Mondays\n\n\n" +
                    "Wrap your arms around me, baby boy\n\n\n" +
                    "Uh huh\n\n\n" +
                    "I like shiny things, but I'd marry you with paper rings\n\n\n" +
                    "Uh huh, that's right\n\n\n" +
                    "You're the one I want\n\n\n" +
                    "I hate accidents except when we went from friends to this\n\n\n" +
                    "Uh huh\n\n\n" +
                    "Darling, you're the one I want\n\n\n" +
                    "I like shiny things, but I'd marry you with paper rings\n\n\n" +
                    "Uh huh, that's right\n\n\n" +
                    "Darling, you're the one I want, and\n\n\n" +
                    "I hate accidents except when we went from friends to this\n\n\n" +
                    "Uh huh, that's right\n\n\n" +
                    "Darling, you're the one I want\n\n\n" +
                    "In paper rings, in picture frames, in dirty dreams\n\n\n" +
                    "You're the one I want\n\n\n" +
                    "In paper rings, in picture frames, and all my dreams\n\n\n" +
                    "Oh, you're the one I want\n\n\n" +
                    "You're the one I want, one I want\n\n\n" +
                    "You're the one I want, one I want\n\n\n");

        }
    }

    public void stop(View view){
        if (songTitle == "Fallen") {
            if (mySong != null) {
                mySong.release();
                mySong = null;

            }
        }
    }
    public void pause(View view){
        if (songTitle == "Fallen") {
            mySong.pause();
        } else if (songTitle == "Ride Home") {
            myRideHome.pause();
        } else if (songTitle == "Sunflower") {
            mySunflower.pause();
        } else if (songTitle == "Umaaraw Umuulan") {
            myUmaarawUmuulan.pause();
        } else if (songTitle == "Paper Rings") {
            myPaperRings.pause();
        }
    }


    public void start(View view) {
        if (songTitle == "Fallen") {
            mySong.start();
        } else if (songTitle == "Ride Home") {
            myRideHome.start();
        }else if (songTitle == "Sunflower") {
            mySunflower.start();
        } else if (songTitle == "Umaaraw Umuulan") {
            myUmaarawUmuulan.start();
        } else if (songTitle == "Paper Rings") {
            myPaperRings.start();
        }
    }

    private void createNotif()
    {
        String id = "my_channel_id_01";
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationChannel channel = manager.getNotificationChannel(id);
            if(channel==null)
            {
                channel = new NotificationChannel(id, "Channel Title", NotificationManager.IMPORTANCE_HIGH);
                //config notification channel
                channel.setDescription("[Channel description]");
                channel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
                manager.createNotificationChannel(channel);

            }
        }
        Intent notificationIntent = new Intent(this,NotificationActivity.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,notificationIntent,0);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,id)
                .setSmallIcon(R.drawable.icon)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.icon))
                .setStyle(new NotificationCompat.BigPictureStyle()
                        .bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.icon))
                        .bigLargeIcon(null))
                .setContentTitle("SWOTIFY")
                .setContentText("Downloading Song")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(false)// true touch on notif menu dismissed, but swipe to dismiss
                .setTicker("Notification");
        builder.setContentIntent(contentIntent);
        NotificationManagerCompat m = NotificationManagerCompat.from(getApplicationContext());
        //id to generate new notification in list notifications menu
        m.notify(new Random().nextInt(),builder.build());


    }

    public void launchFourthActivity(View view) {
        Intent intent = new Intent(this, Fourth.class);
        startActivity(intent);
    }
}