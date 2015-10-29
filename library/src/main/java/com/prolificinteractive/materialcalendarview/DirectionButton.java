package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;

import com.prolificinteractive.materialcalendarview.utils.ViewUtils;

/**
 * An {@linkplain android.widget.ImageView} to pragmatically set the color of arrows
 * using a {@linkplain android.graphics.ColorFilter}
 */
class DirectionButton extends ImageView {

    public DirectionButton(Context context) {
        super(context);

        setBackgroundResource(ViewUtils.getThemeSelectableBackgroundId(context));
    }

    public void setColor(int color) {
        setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setAlpha(enabled ? 1f : 0.1f);
    }
}
