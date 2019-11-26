package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wjp */
public final class wjp extends BaseAdapter {
    public final List a = new ArrayList();
    public aqyl b;
    public boolean c;
    private final LayoutInflater d;
    private final akvp e;
    private final Context f;
    private final int g;

    wjp(Context context, akvp akvp) {
        this.d = LayoutInflater.from(context);
        this.e = akvp;
        this.g = context.getResources().getDimensionPixelOffset(R.dimen.post_dialog_filter_top_bottom_padding);
        this.f = context;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.a.size();
    }

    /* renamed from: a */
    public final aqyl getItem(int i) {
        return (aqyl) this.a.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, false);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return a(i, view, viewGroup, true);
    }

    private final View a(int i, View view, ViewGroup viewGroup, boolean z) {
        wjo wjo;
        aqyl aqyl = (aqyl) getItem(i);
        int i2 = 0;
        if (view == null) {
            wjo = new wjo(this.d.inflate(R.layout.backstage_access_restriction_item, viewGroup, false), this.f, this.c);
            wjo.a.setTag(wjo);
        } else {
            wjo = (wjo) view.getTag();
        }
        boolean z2 = (aqyl.a & 2) != 0;
        if (z2) {
            ImageView imageView = wjo.d;
            akvp akvp = this.e;
            arwf arwf = aqyl.e;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageView.setImageResource(akvp.a(a));
            wjo.d.setColorFilter(xwe.a(this.f, R.attr.ytTextSecondary, 0));
            imageView = wjo.d;
            arml arml = aqyl.f;
            if (arml == null) {
                arml = arml.f;
            }
            imageView.setContentDescription(ajqy.a(arml));
        }
        xpr.a(wjo.d, z2);
        YouTubeTextView youTubeTextView = wjo.c;
        arml arml2 = aqyl.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        youTubeTextView.setText(ajqy.a(arml2));
        if (z) {
            wjo.b.setBackgroundColor(aqyl.equals(this.b) ? ra.c(this.f, R.color.quantum_grey300) : 0);
            View view2 = wjo.a;
            int paddingLeft = view2.getPaddingLeft();
            int i3 = i == 0 ? this.g : 0;
            int paddingRight = wjo.a.getPaddingRight();
            if (i == getCount() - 1) {
                i2 = this.g;
            }
            view2.setPadding(paddingLeft, i3, paddingRight, i2);
        } else {
            View view3 = wjo.b;
            view3.setPadding(!this.c ? view3.getPaddingLeft() : 0, 0, !this.c ? wjo.b.getPaddingRight() : 0, 0);
        }
        return wjo.a;
    }
}
