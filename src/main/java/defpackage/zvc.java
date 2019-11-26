package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.google.android.youtube.R;

/* renamed from: zvc */
public final class zvc implements zwh {
    private final akkq a;
    private ImageSpan b;

    public zvc(akkq akkq) {
        this.a = (akkq) amqw.a((Object) akkq);
    }

    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        arml arml;
        Object obj;
        Object obj2;
        arml arml2;
        zve zve = (zve) aqj;
        arxp d = zud.d();
        arml arml3 = null;
        if ((d.a & 2) != 0) {
            arml = d.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        if ((d.a & 64) != 0) {
            obj = d.h;
            if (obj == null) {
                obj = apxu.d;
            }
        } else {
            obj = null;
        }
        apxu apxu = (apxu) amqw.a(obj);
        if ((d.a & 1) != 0) {
            obj2 = d.b;
            if (obj2 == null) {
                obj2 = aygk.f;
            }
        } else {
            obj2 = null;
        }
        aygk aygk = (aygk) amqw.a(obj2);
        if ((d.a & 4) != 0) {
            arml2 = d.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a2 = ajqy.a(arml2);
        if ((d.a & 32) != 0) {
            arml3 = d.g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        CharSequence a3 = ajqy.a(arml3);
        if (a3 != null) {
            a3 = a3.toString().toUpperCase(context.getResources().getConfiguration().locale);
        }
        this.a.a(zve.p, aygk);
        xpr.a(zve.q, a2);
        xpr.a(zve.r, a);
        if (a3 == null) {
            zve.s.setVisibility(8);
        } else {
            if (d.e) {
                TextView textView = zve.s;
                if (this.b == null) {
                    this.b = new ImageSpan(context, BitmapFactory.decodeResource(context.getResources(), R.drawable.info_card_link), 1);
                }
                ImageSpan imageSpan = this.b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a3);
                spannableStringBuilder.append(160);
                spannableStringBuilder.append(160);
                spannableStringBuilder.append(8195);
                spannableStringBuilder.append(8195);
                spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                textView.setText(spannableStringBuilder, BufferType.SPANNABLE);
            } else {
                zve.s.setText(a3);
            }
            zve.s.setContentDescription(a3);
            zve.s.setVisibility(0);
        }
        zve.a.setOnClickListener(new zvb(zwj, apxu));
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new zve(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_simple_watch_next : R.layout.info_card_simple, viewGroup, false));
    }
}
