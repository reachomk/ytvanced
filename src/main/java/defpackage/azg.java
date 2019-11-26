package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: azg */
final class azg extends ArrayAdapter implements OnItemClickListener {
    private final LayoutInflater a;
    private final Drawable b;
    private final Drawable c;
    private final Drawable d;
    private final Drawable e;
    private final /* synthetic */ azf f;

    public azg(azf azf, Context context, List list) {
        this.f = azf;
        super(context, 0, list);
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.mediaRouteDefaultIconDrawable, R.attr.mediaRouteTvIconDrawable, R.attr.mediaRouteSpeakerIconDrawable, R.attr.mediaRouteSpeakerGroupIconDrawable});
        this.b = obtainStyledAttributes.getDrawable(0);
        this.c = obtainStyledAttributes.getDrawable(1);
        this.d = obtainStyledAttributes.getDrawable(2);
        this.e = obtainStyledAttributes.getDrawable(3);
        obtainStyledAttributes.recycle();
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return ((bbs) getItem(i)).g;
    }

    /* JADX WARNING: Missing block: B:16:0x007c, code skipped:
            if (r0 != null) goto L_0x00ad;
     */
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
        r6 = this;
        r0 = 0;
        if (r8 != 0) goto L_0x000c;
    L_0x0003:
        r8 = r6.a;
        r1 = 2131034947; // 0x7f050343 float:1.7680426E38 double:1.0528711574E-314;
        r8 = r8.inflate(r1, r9, r0);
    L_0x000c:
        r7 = r6.getItem(r7);
        r7 = (defpackage.bbs) r7;
        r9 = 2131757613; // 0x7f100a2d float:1.9146167E38 double:1.053228202E-314;
        r9 = r8.findViewById(r9);
        r9 = (android.widget.TextView) r9;
        r1 = 2131757614; // 0x7f100a2e float:1.9146169E38 double:1.0532282023E-314;
        r1 = r8.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = r7.d;
        r9.setText(r2);
        r2 = r7.e;
        r3 = r7.h;
        r4 = 1;
        r5 = 2;
        if (r3 == r5) goto L_0x0034;
    L_0x0031:
        if (r3 == r4) goto L_0x0034;
    L_0x0033:
        goto L_0x0046;
    L_0x0034:
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x0046;
    L_0x003a:
        r3 = 80;
        r9.setGravity(r3);
        r1.setVisibility(r0);
        r1.setText(r2);
        goto L_0x0055;
    L_0x0046:
        r0 = 16;
        r9.setGravity(r0);
        r9 = 8;
        r1.setVisibility(r9);
        r9 = "";
        r1.setText(r9);
    L_0x0055:
        r9 = r7.g;
        r8.setEnabled(r9);
        r9 = 2131757612; // 0x7f100a2c float:1.9146165E38 double:1.0532282013E-314;
        r9 = r8.findViewById(r9);
        r9 = (android.widget.ImageView) r9;
        if (r9 != 0) goto L_0x0066;
    L_0x0065:
        goto L_0x00b0;
    L_0x0066:
        r0 = r7.f;
        if (r0 != 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0096;
    L_0x006b:
        r1 = r6.getContext();	 Catch:{ IOException -> 0x007f }
        r1 = r1.getContentResolver();	 Catch:{ IOException -> 0x007f }
        r1 = r1.openInputStream(r0);	 Catch:{ IOException -> 0x007f }
        r2 = 0;
        r0 = android.graphics.drawable.Drawable.createFromStream(r1, r2);	 Catch:{ IOException -> 0x007f }
        if (r0 == 0) goto L_0x0096;
    L_0x007e:
        goto L_0x00ad;
    L_0x007f:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Failed to load ";
        r2.append(r3);
        r2.append(r0);
        r0 = r2.toString();
        r2 = "MediaRouteChooserDialog";
        android.util.Log.w(r2, r0, r1);
    L_0x0096:
        r0 = r7.m;
        if (r0 == r4) goto L_0x00ab;
    L_0x009a:
        if (r0 == r5) goto L_0x00a8;
    L_0x009c:
        r7 = r7.f();
        if (r7 == 0) goto L_0x00a5;
    L_0x00a2:
        r0 = r6.e;
        goto L_0x00ad;
    L_0x00a5:
        r0 = r6.b;
        goto L_0x00ad;
    L_0x00a8:
        r0 = r6.d;
        goto L_0x00ad;
    L_0x00ab:
        r0 = r6.c;
    L_0x00ad:
        r9.setImageDrawable(r0);
    L_0x00b0:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azg.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        bbs bbs = (bbs) getItem(i);
        if (bbs.g) {
            bbs.e();
            this.f.dismiss();
        }
    }
}
