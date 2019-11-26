package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: woy */
public final class woy {
    public final aaas a;
    public final View b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final SeekBar f;
    public final akyy g;
    public final akyy h;
    public final Dialog i;
    public aypv j;
    public int k = 0;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final TextView o;

    public woy(Context context, akzb akzb, aaas aaas) {
        amqw.a((Object) context);
        amqw.a((Object) akzb);
        amqw.a((Object) aaas);
        this.a = aaas;
        this.b = LayoutInflater.from(context).inflate(R.layout.ypc_pause_membership_dialog, null);
        this.c = (TextView) this.b.findViewById(R.id.title);
        this.d = (TextView) this.b.findViewById(R.id.subtitle);
        this.e = (TextView) this.b.findViewById(R.id.description);
        this.l = (TextView) this.b.findViewById(R.id.pause_period);
        this.m = (TextView) this.b.findViewById(R.id.pause_end);
        this.f = (SeekBar) this.b.findViewById(R.id.pause_period_slider);
        this.n = (TextView) this.b.findViewById(R.id.primary_button);
        this.o = (TextView) this.b.findViewById(R.id.cancel);
        this.g = akzb.a(this.n);
        this.h = akzb.a(this.o);
        this.i = new Dialog(context);
        this.i.setContentView(this.b);
    }

    public static Spanned a(Spanned[] spannedArr, int i) {
        return (spannedArr == null || spannedArr.length <= i) ? null : spannedArr[i];
    }

    public final void a() {
        aypv aypv = this.j;
        if (aypv != null) {
            TextView textView = this.l;
            arml arml = ((aypx) aypv.d.get(this.k)).b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            TextView textView2 = this.m;
            aypv aypv2 = this.j;
            arml arml2 = ((aypx) aypv2.d.get(this.k)).c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textView2.setText(ajqy.a(arml2));
            SeekBar seekBar = this.f;
            aypv2 = this.j;
            aodv aodv = ((aypx) aypv2.d.get(this.k)).d;
            if (aodv == null) {
                aodv = aodv.c;
            }
            seekBar.setContentDescription(aodv.b);
        }
    }
}
