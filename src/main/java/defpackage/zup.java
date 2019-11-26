package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: zup */
public final class zup implements zwh {
    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        zuw zuw = (zuw) aqj;
        zun zun = zud.c;
        LayoutInflater from = LayoutInflater.from(context);
        xpr.a(zuw.q, zun.a());
        a(zuw, context, from, zwj, zun.b, null);
        zuw.q.setContentDescription(context.getString(R.string.accessibility_poll_question_talk_back, new Object[]{zun.a(), Integer.valueOf(zun.b.size())}));
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return new zuw(LayoutInflater.from(context).inflate(!z ? R.layout.info_card_poll_watch_next : R.layout.info_card_poll, viewGroup, false), z);
    }

    public final void a(zuw zuw, Context context, LayoutInflater layoutInflater, zwj zwj, List list, zwp zwp) {
        zuw zuw2 = zuw;
        Context context2 = context;
        zwp zwp2 = zwp;
        zus zus = new zus(this, context, zwj, zuw, layoutInflater, list);
        boolean z = false;
        int i = 0;
        while (i < list.size()) {
            View childAt;
            arml arml;
            int a;
            int i2;
            if (i < zuw2.r.getChildCount()) {
                childAt = zuw2.r.getChildAt(i);
                LayoutInflater layoutInflater2 = layoutInflater;
            } else {
                childAt = layoutInflater.inflate(!zuw2.p ? R.layout.info_card_poll_choice_watch_next : R.layout.info_card_poll_choice, zuw2.r, z);
                zuw2.r.addView(childAt);
            }
            View view = childAt;
            zuq zuq = (zuq) list.get(i);
            ImageView imageView = (ImageView) view.findViewById(R.id.checkbox);
            TextView textView = (TextView) view.findViewById(R.id.text);
            TextView textView2 = (TextView) view.findViewById(R.id.percent);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.result_bar);
            awlw awlw = zuq.a;
            if ((awlw.a & 1) != 0) {
                arml = awlw.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            xpr.a(textView, ajqy.a(arml));
            if (zuq.b.c) {
                a = xwe.a(context2, R.attr.ytTextSecondary, 0);
                textView.setTextColor(a);
                xpr.a(textView2, context2.getString(R.string.infocards_percent, new Object[]{Integer.valueOf((int) (zuq.d() * 100.0f))}));
                textView2.setTextColor(a);
                progressBar.setVisibility(0);
                if (zwp2 == null) {
                    progressBar.setProgress((int) (((float) progressBar.getMax()) * zuq.d()));
                } else {
                    zwp2.a.add(new zwo(progressBar, (float) progressBar.getProgress(), (float) ((int) (((float) progressBar.getMax()) * zuq.d()))));
                }
                a = R.attr.ytTextPrimary;
                i2 = 0;
            } else {
                a = R.attr.ytTextPrimary;
                i2 = 0;
                textView.setTextColor(xwe.a(context2, R.attr.ytTextPrimary, 0));
                textView2.setVisibility(8);
                progressBar.setVisibility(4);
                progressBar.setProgress(0);
            }
            if (zuq.a()) {
                a = xwe.a(context2, a, i2);
                textView.setTextColor(a);
                textView2.setTextColor(a);
                Drawable a2 = ra.a(context2, (int) R.drawable.info_card_poll_checked);
                if (a2 != null) {
                    int a3 = xwe.a(context2, R.attr.ytStaticBlue, i2);
                    a2 = st.d(a2);
                    st.a(a2, a3);
                } else {
                    a2 = null;
                }
                imageView.setImageDrawable(a2);
                imageView.setContentDescription(context2.getString(R.string.accessibility_poll_checked_talk_back));
            } else {
                a = xwe.a(context2, R.attr.ytTextSecondary, i2);
                textView.setTextColor(a);
                textView2.setTextColor(a);
                Drawable a4 = ra.a(context2, (int) R.drawable.info_card_poll_unchecked);
                if (a4 != null) {
                    a4 = st.d(a4);
                    st.a(a4, a);
                } else {
                    a4 = null;
                }
                imageView.setImageDrawable(a4);
                imageView.setContentDescription(context2.getString(R.string.accessibility_poll_not_checked_talk_back));
            }
            view.setOnClickListener(new zuu(zwj, zuq, zus));
            z = false;
            view.setVisibility(0);
            i++;
        }
        while (i < zuw2.r.getChildCount()) {
            zuw2.r.getChildAt(i).setVisibility(8);
            i++;
        }
        if (zwp2 != null) {
            zuw2.a.startAnimation(zwp2);
        }
    }
}
