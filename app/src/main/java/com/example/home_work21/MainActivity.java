package com.example.home_work21;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import com.example.home_work21.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int currentSongIndex = 0;
    private String[] songTitles = {"Drake - Hotline Bling", "The Weeknd - Blinding Lights", "Eminem - Without Me"};
    private String[] songLyrics = {"You used to call me on my\n" +
            "You used to, you used to\n" +
            "Yeah\n" +
            "You used to call me on my cell phone\n" +
            "Late night when you need my love\n" +
            "Call me on my cell phone\n" +
            "Late night when you need my love\n" +
            "And I know when that hotline bling\n" +
            "That can only mean one thing\n" +
            "I know when that hotline bling\n" +
            "That can only mean one thing\n" +
            "Ever since I left the city, you\n" +
            "Got a reputation for yourself now\n" +
            "Everybody knows and I feel left out\n" +
            "Girl you got me down, you got me stressed out\n" +
            "Cause ever since I left the city, you\n" +
            "Started wearing less and goin' out more\n" +
            "Glasses of champagne out on the dance floor\n" +
            "Hangin' with some girls I've never seen before", "I've been tryna call\n" +
            "I've been on my own for long enough\n" +
            "Maybe you can show me how to love, maybe\n" +
            "I'm going through withdrawals\n" +
            "You don't even have to do too much\n" +
            "You can turn me on with just a touch, baby\n" +
            "\n" +
            "I look around and\n" +
            "Sin City's cold and empty (oh)\n" +
            "No one's around to judge me (oh)\n" +
            "I can't see clearly when you're gone\n" +
            "\n" +
            "I said, ooh, I'm blinded by the lights\n" +
            "No, I can't sleep until I feel your touch\n" +
            "I said, ooh, I'm drowning in the night\n" +
            "Oh, when I'm like this, you're the one I trust\n" +
            "(Hey, hey, hey)\n" +
            "\n" +
            "I'm running out of time\n" +
            "'Cause I can see the sun light up the sky\n" +
            "So I hit the road in overdrive, baby, oh\n" +
            "\n" +
            "The city's cold and empty (oh)\n" +
            "No one's around to judge me (oh)\n" +
            "I can't see clearly when you're gone\n" +
            "\n" +
            "I said, ooh, I'm blinded by the lights\n" +
            "No, I can't sleep until I feel your touch\n" +
            "I said, ooh, I'm drowning in the night\n" +
            "Oh, when I'm like this, you're the one I trust\n" +
            "\n" +
            "I'm just walking by to let you know (by to let you know)\n" +
            "I can never say it on the phone (say it on the phone)\n" +
            "Will never let you go this time (ooh)\n" +
            "\n" +
            "I said, ooh, I'm blinded by the lights\n" +
            "No, I can't sleep until I feel your touch\n" +
            "(Hey, hey, hey)\n" +
            "\n" +
            "(Hey, hey, hey)\n" +
            "\n" +
            "I said, ooh, I'm blinded by the lights\n" +
            "No, I can't sleep until I feel your touch", "Two trailer-park girls go 'round the outside, 'round the outside, 'round the outside\n" +
            "Two trailer-park girls go 'round the outside, 'round the outside, 'round the outside\n" +
            "\n" +
            "Guess who's back, back again\n" +
            "Shady's back, tell a friend\n" +
            "Guess who's back\n" +
            "Guess who's back\n" +
            "Guess who's back\n" +
            "Guess who's back\n" +
            "Guess who's back\n" +
            "Guess who's back\n" +
            "Guess who's back\n" +
            "\n" +
            "I've created a monster\n" +
            "'Cause nobody wants to see Marshall no more\n" +
            "They want Shady I'm chopped liver\n" +
            "Well if you want Shady, this is what I'll give ya\n" +
            "A little bit of weed mixed with some hard liquor\n" +
            "Some vodka that'll jump-start my heart\n" +
            "Quicker than a shock\n" +
            "When I get shocked at the hospital by the doctor\n" +
            "When I'm not cooperating\n" +
            "When I'm rocking the table while he's operating (hey!)\n" +
            "\n" +
            "You waited this long now stop debating\n" +
            "'Cause I'm back I'm on the rag and ovulating\n" +
            "I know that you got a job Ms. Cheney\n" +
            "But your husband's heart problem's complicating\n" +
            "\n" +
            "So the FCC won't let me be\n" +
            "Or let me be me so let me see\n" +
            "They try to shut me down on MTV\n" +
            "But it feels so empty without me\n" +
            "\n" +
            "So come on dip, bum on your lips fuck that\n" +
            "Cum on your lips and some on your tits and get ready 'cause this shit's about to get heavy\n" +
            "I just settled all my lawsuits\n" +
            "Fuck you, Debbie!\n" +
            "\n" +
            "Now this looks like a job for me so everybody just follow me\n" +
            "'Cause we need a little controversy\n" +
            "'Cause it feels so empty without me\n" +
            "\n" +
            "I said this looks like a job for me so everybody just follow me\n" +
            "'Cause we need a little controversy\n" +
            "'Cause it feels so empty without me\n" +
            "\n" +
            "Little hellions kids feeling rebellious\n" +
            "Embarrassed, their parents still listen to Elvis\n" +
            "They start feeling like prisoners, helpless\n" +
            "'Til someone comes along on a mission and yells \"bitch\"\n" +
            "\n" +
            "A visionary, vision is scary\n" +
            "Could start a revolution\n" +
            "Polluting the air waves a rebel\n" +
            "So just let me revel and bask\n" +
            "In the fact that I got everyone kissing my ass\n" +
            "And it's a disaster\n" +
            "Such a catastrophe for you to see so damn much of my ass\n" +
            "You ask for me?\n" +
            "\n" +
            "Well I'm back\n" +
            "Fix your bent antennae\n" +
            "Tune it in and then I'm gonna enter in\n" +
            "And up under your skin like a splinter\n" +
            "The center of attention back for the winter\n" +
            "\n" +
            "I'm interesting, the best thing since wrestling\n" +
            "Infesting in your kid's ears and nesting\n" +
            "Testing attention please\n" +
            "Feel the tension soon as someone mentions me\n" +
            "Here's my 10 cents my 2 cents is free\n" +
            "A nuisance, who sent, you sent for me?\n" +
            "\n" +
            "Now this looks like a job for me so everybody just follow me\n" +
            "'Cause we need a little controversy\n" +
            "'Cause it feels so empty without me\n" +
            "\n" +
            "I said this looks like a job for me so everybody just follow me\n" +
            "'Cause we need a little controversy\n" +
            "'Cause it feels so empty without me\n" +
            "\n" +
            "A tisk-it a task-it\n" +
            "I'll go tit for tat with anybody who's talking this shit, that shit\n" +
            "Chris Kirkpatrick you can get your ass kicked\n" +
            "Worse than them little Limp Bizkit bastards\n" +
            "\n" +
            "And Moby\n" +
            "You can get stomped by Obie\n" +
            "You 36 year old bald-headed fag blow me\n" +
            "You don't know me\n" +
            "You're too old\n" +
            "Let go\n" +
            "It's over, nobody listens to techno\n" +
            "\n" +
            "Now let's go, just give me the signal\n" +
            "I'll be there with a whole list full of new insults\n" +
            "I've been dope, suspenseful with a pencil\n" +
            "Ever since Prince turned himself into a symbol\n" +
            "\n" +
            "But sometimes the shit just seems\n" +
            "Everybody only wants to discuss me\n" +
            "So this must mean I'm disgusting\n" +
            "But it's just me I'm just obscene\n" +
            "\n" +
            "No, I'm not the first king of controversy\n" +
            "I am the worst thing since Elvis Presley\n" +
            "To do black music so selfishly\n" +
            "And use it to get myself wealthy (Hey)\n" +
            "\n" +
            "There's a concept that works\n" +
            "20 million other white rappers emerge\n" +
            "But no matter how many fish in the sea\n" +
            "It'd be so empty without me\n" +
            "\n" +
            "Now this looks like a job for me so everybody just follow me\n" +
            "'Cause we need a little controversy\n" +
            "'Cause it feels so empty without me\n" +
            "\n" +
            "I said this looks like a job for me so everybody just follow me\n" +
            "'Cause we need a little controversy\n" +
            "'Cause it feels so empty without me\n" +
            "\n" +
            "Kids"};
    private int[] coverImages = {R.drawable.cover1, R.drawable.cover2, R.drawable.cover3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // Инициализация ViewBinding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Устанавливаем начальные данные для песни
        updateSongDetails();

        // Обработка кнопки "Вперёд"
        binding.nextButton.setOnClickListener(v -> {
            currentSongIndex = (currentSongIndex + 1) % songTitles.length;
            updateSongDetails();
        });

        // Обработка кнопки "Назад"
        binding.prevButton.setOnClickListener(v -> {
            currentSongIndex = (currentSongIndex - 1 + songTitles.length) % songTitles.length;
            updateSongDetails();
        });

        ProgressBar progressBar = findViewById(R.id.progress_bar);

        // Создаем ObjectAnimator для анимации прогресса
        ObjectAnimator animator = ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        animator.setDuration(20000); // Длительность анимации (5 секунд)
        animator.start(); // Запуск анимации

        // Открытие DetailActivity по клику на обложку
        binding.albumCover.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("songTitle", songTitles[currentSongIndex] + songLyrics[currentSongIndex]);
            startActivity(intent);


        });
    }

    private void updateSongDetails() {
        binding.trackTitle.setText(songTitles[currentSongIndex]);
        binding.albumCover.setImageResource(coverImages[currentSongIndex]);
    }
}
