package com.isjfk.android.racad.labeler;

import android.content.Context;

import com.isjfk.android.racad.timeview.TimeLayoutView;
import com.isjfk.android.racad.timeview.TimeView;

/**
 * A Labeler that displays months using TimeLayoutViews.
 */
public class MonthYearLabeler extends MonthLabeler {
    /**
     * The format string that specifies how to display the month. Since this class
     * uses a TimeLayoutView, the format string should consist of two strings
     * separated by a space.
     *
     * @param formatString
     */
    public MonthYearLabeler(String formatString) {
        super(formatString);
    }

    @Override
    public TimeView createView(Context context, boolean isCenterView) {
        return new TimeLayoutView(context, isCenterView, 25, 8, 0.95f);
    }
}