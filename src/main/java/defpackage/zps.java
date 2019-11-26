package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: zps */
public final class zps extends apk {
    private final int a;

    zps(Context context) {
        this.a = context.getResources().getDimensionPixelSize(R.dimen.gallery_thumb_margin);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        ano ano = (ano) view.getLayoutParams();
        aqj aqj = ano.c;
        int i = aqj.g;
        if (i == -1) {
            i = aqj.c;
        }
        if (i != -1) {
            int i2 = ((anm) recyclerView.n).a;
            int i3 = ano.a;
            i = i2 - 1;
            int i4 = this.a;
            int i5 = (i * i4) / i2;
            if (i2 < 2) {
                i3 = 0;
            } else {
                if (i3 == 0) {
                    i3 = 0;
                } else if (i3 != i) {
                    i3 = i5 / 2;
                    i5 = i3;
                } else {
                    i3 = i5;
                }
                rect.set(i3, 0, i5, i4);
                return;
            }
            i5 = 0;
            rect.set(i3, 0, i5, i4);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
