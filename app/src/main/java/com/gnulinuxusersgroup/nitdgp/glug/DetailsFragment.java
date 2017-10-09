package com.gnulinuxusersgroup.nitdgp.glug;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gravitydestroyer on 24/09/17.
 */
public class DetailsFragment extends android.support.v4.app.Fragment {
    private static final String ARG_KITTEN_NUMBER = "argKittenNumber";

    /**
     * Create a new DetailsFragment
     * @param kittenNumber The number (between 1 and 4) of the kitten to display
     */
    public static DetailsFragment newInstance(@IntRange(from = 1, to = 4) int kittenNumber) {
        Bundle args = new Bundle();
        args.putInt(ARG_KITTEN_NUMBER, kittenNumber);

        DetailsFragment fragment = new DetailsFragment();
        fragment.setArguments(args);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.details_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView text_head=(TextView) view.findViewById(R.id.text_head);
        TextView text_body=(TextView) view.findViewById(R.id.text_body);

        Button call_button=(Button) view.findViewById(R.id.call_button);

        Bundle args = getArguments();
        int kittenNumber = args.containsKey(ARG_KITTEN_NUMBER) ? args.getInt(ARG_KITTEN_NUMBER) : 1;

        switch (kittenNumber) {
            case 1:
                image.setImageResource(R.drawable.adarsh);
                text_head.setText("President");
                text_body.setText("Adarsh Singh\nPh no.: +91 7076316399 \nEmail id: Adarsh@nitdgp;ug.org ");
                call_button.setText("Contact Adarsh");

                call_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentcall = new Intent();
                        intentcall.setAction(Intent.ACTION_DIAL);
                        String phonenumber="+917076316399";
                        intentcall.setData(Uri.parse("tel:" + phonenumber)); // set the Uri
                        startActivity(intentcall);
                    }
                });

                break;
            case 2:
                image.setImageResource(R.drawable.piyush);
                text_head.setText("Treasurer");
                text_body.setText("Piyush Agrawal\nPh no.: +91 9641407625 \nEmail id: piyush@nitdgplug.org ");
                call_button.setText("Contact Piyush");

                call_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentcall = new Intent();
                        intentcall.setAction(Intent.ACTION_DIAL);
                        String phonenumber="+91 9641407625";
                        intentcall.setData(Uri.parse("tel:" + phonenumber)); // set the Uri
                        startActivity(intentcall);
                    }
                });
                break;
            case 3:
                image.setImageResource(R.drawable.sneh);
                text_head.setText("Convenor");
                text_body.setText("Sneh Smriti\nPh no.: +91 7063698947 \nEmail id: sneh@nitdgplug.org ");

                call_button.setText("Contact Sneh");

                call_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentcall = new Intent();
                        intentcall.setAction(Intent.ACTION_DIAL);
                        String phonenumber="+917063698947";
                        intentcall.setData(Uri.parse("tel:" + phonenumber)); // set the Uri
                        startActivity(intentcall);
                    }
                });
                break;
            case 4:
                image.setImageResource(R.drawable.neetesh);
                text_head.setText("General Secretary");
                text_body.setText("Arka Roy\nPh no.: +91 8906700509 \nEmail id: arka@nitdgplug.org ");

                call_button.setText("Contact Arka");

                call_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intentcall = new Intent();
                        intentcall.setAction(Intent.ACTION_DIAL);
                        String phonenumber="++918906700509";
                        intentcall.setData(Uri.parse("tel:" + phonenumber)); // set the Uri
                        startActivity(intentcall);
                    }
                });
                break;

        }
    }
}
