package com.gnulinuxusersgroup.nitdgp.glug;

/**
 * Created by gravitydestroyer on 01/10/17.
 */

/**
 * Listener for kitten click events in the grid of kittens
 *
 * @author bherbst
 */
public interface KittenClickListener2 {
    /**
     * Called when a kitten is clicked
     * @param holder The ViewHolder for the clicked kitten
     * @param position The position in the grid of the kitten that was clicked
     */
    void onKittenClicked(KittenViewHolder2 holder, int position);
}
