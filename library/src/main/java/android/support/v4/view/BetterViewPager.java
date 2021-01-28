package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.viewpager.widget.ViewPager;

/**
 * And was making view creation time rather large. So lets override it and make it better!
 */
public class BetterViewPager extends ViewPager {

    public BetterViewPager(Context context) {
        super(context);
    }

    public BetterViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
