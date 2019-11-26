package defpackage;

import android.app.Dialog;
import android.graphics.Point;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: gpv */
final /* synthetic */ class gpv implements OnClickListener {
    private final gpt a;
    private final awgc b;

    gpv(gpt gpt, awgc awgc) {
        this.a = gpt;
        this.b = awgc;
    }

    public final void onClick(View view) {
        int i;
        gpt gpt = this.a;
        awgc awgc = this.b;
        gpt.b(awgc.e);
        Object a = gpt.a(awgc);
        amqw.a(a);
        amqw.b((a.a & 2) != 0);
        gpt.a();
        gpt.i = new Dialog(gpt.c, R.style.f310ReelTheme.Dialog.VideoInteraction);
        View a2 = gpt.a(view, a);
        a2.setOnClickListener(new gpy(gpt, a));
        gpt.i.setContentView(a2);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(gpt.i.getWindow().getAttributes());
        Point a3 = gpt.a(view);
        layoutParams.x = a3.x - (gpt.j / 2);
        if (a3.y < gpt.b) {
            i = a3.y + gpt.a;
        } else {
            i = (a3.y - gpt.a) - gpt.k;
        }
        layoutParams.y = i;
        layoutParams.gravity = 51;
        layoutParams.width = gpt.j;
        layoutParams.height = gpt.k;
        gpt.i.getWindow().setAttributes(layoutParams);
        gpt.i.show();
        gpt.i.setOnShowListener(new gpx(a2));
        gpt.a(a.d);
    }
}
