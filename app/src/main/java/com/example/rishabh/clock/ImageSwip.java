package com.example.rishabh.clock;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rishabh on 2/4/2018.
 */

public class ImageSwip extends PagerAdapter {

    private int[] resources={R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six,
            R.drawable.seven,
            R.drawable.eight,
            R.drawable.nine,
            R.drawable.ten,
            R.drawable.eleven,
            R.drawable.twelve,
            R.drawable.one15,
            R.drawable.two30,
            R.drawable.three45,
            R.drawable.five10,
            R.drawable.ten10,
    };

    private Context ctx;
    private LayoutInflater  inflater;

    public ImageSwip(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater.inflate(R.layout.image_swip,container,false);
        ImageView imageView=(ImageView)itemView.findViewById(R.id.timeImage);
        TextView textView=(TextView)itemView.findViewById(R.id.imageText);
        imageView.setImageResource(resources[position]);
        container.addView(itemView);

        //changing text according to image position
        switch (position)
        {
            case 0:
                textView.setText("1:00");
                break;
                case 1:
                textView.setText("2:00");
                break;
                case 2:
                textView.setText("3:00");
                break;
                case 3:
                textView.setText("4:00");
                break;
                case 4:
                textView.setText("5:00");
                break;
                case 5:
                textView.setText("6:00");
                break;
                case 6:
                textView.setText("7:00");
                break;
                case 7:
                textView.setText("8:00");
                break;
                case 8:
                textView.setText("9:00");
                break;
                case 9:
                textView.setText("10:00");
                break;
                case 10:
                textView.setText("11:00");
                break;
                case 11:
                textView.setText("12:00");
                break;
                case 12:
                textView.setText("1:15");
                break;
                case 13:
                textView.setText("2:30");
                break;
                case 14:
                textView.setText("3:45");
                break;
                case 15:
                textView.setText("5:10");
                break;
                case 16:
                textView.setText("10:10");
                break;
        }
        return itemView;
    }



    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }
}
