package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.youtube.R;

/* renamed from: adfo */
public final class adfo extends azl {
    public final bbs V = bbb.c();
    public final bcaa W;

    public adfo(Context context, int i, bcaa bcaa) {
        super(context, i);
        bbb.a(getContext());
        this.W = (bcaa) amqw.a((Object) bcaa);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        if (VERSION.SDK_INT < 21) {
            findViewById = findViewById(R.id.mr_art);
            if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
                ((ViewGroup) findViewById.getParent()).removeView(findViewById);
            }
        }
        if (VERSION.SDK_INT == 21 || VERSION.SDK_INT == 22) {
            findViewById = findViewById(R.id.mr_volume_slider);
            if (findViewById instanceof ali) {
                ((ali) findViewById).setProgressDrawable(getContext().getResources().getDrawable(R.drawable.mr_cast_route_seekbar_track));
            }
        }
        Button button = (Button) findViewById(16908313);
        if (button != null) {
            button.setOnClickListener(new adfr(this));
        }
    }
}
