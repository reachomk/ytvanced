package defpackage;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.widget.RemoteViews;
import com.google.android.youtube.R;

/* renamed from: qj */
public class qj {
    public qg b;
    public CharSequence c;
    public CharSequence d;
    public boolean e = false;

    public RemoteViews a() {
        return null;
    }

    public void a(qd qdVar) {
    }

    public RemoteViews b() {
        return null;
    }

    public RemoteViews c() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
    public final android.widget.RemoteViews a(int r12, boolean r13) {
        /*
        r11 = this;
        r0 = r11.b;
        r0 = r0.a;
        r0 = r0.getResources();
        r7 = new android.widget.RemoteViews;
        r1 = r11.b;
        r1 = r1.a;
        r1 = r1.getPackageName();
        r7.<init>(r1, r12);
        r12 = r11.b;
        r12 = r12.i;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        r3 = 2131755429; // 0x7f1001a5 float:1.9141737E38 double:1.053227123E-314;
        if (r1 < r2) goto L_0x0023;
    L_0x0022:
        goto L_0x0044;
    L_0x0023:
        r1 = -1;
        r4 = 2131757740; // 0x7f100aac float:1.9146424E38 double:1.0532282646E-314;
        r5 = "setBackgroundResource";
        if (r12 >= r1) goto L_0x0038;
    L_0x002b:
        r12 = 2130838825; // 0x7f020529 float:1.7282643E38 double:1.0527742603E-314;
        r7.setInt(r4, r5, r12);
        r12 = 2130839567; // 0x7f02080f float:1.7284148E38 double:1.052774627E-314;
        r7.setInt(r3, r5, r12);
        goto L_0x0044;
    L_0x0038:
        r12 = 2130838824; // 0x7f020528 float:1.7282641E38 double:1.05277426E-314;
        r7.setInt(r4, r5, r12);
        r12 = 2130839566; // 0x7f02080e float:1.7284146E38 double:1.0527746264E-314;
        r7.setInt(r3, r5, r12);
    L_0x0044:
        r12 = r11.b;
        r12 = r12.g;
        r8 = 0;
        if (r12 == 0) goto L_0x0055;
    L_0x004b:
        r7.setViewVisibility(r3, r8);
        r12 = r11.b;
        r12 = r12.g;
        r7.setImageViewBitmap(r3, r12);
    L_0x0055:
        r12 = r11.b;
        r12 = r12.d;
        if (r12 == 0) goto L_0x0061;
    L_0x005b:
        r1 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        r7.setTextViewText(r1, r12);
    L_0x0061:
        r12 = r11.b;
        r12 = r12.e;
        r1 = 2131755182; // 0x7f1000ae float:1.9141236E38 double:1.053227001E-314;
        r3 = 1;
        if (r12 == 0) goto L_0x0070;
    L_0x006b:
        r7.setTextViewText(r1, r12);
        r12 = 1;
        goto L_0x0071;
    L_0x0070:
        r12 = 0;
    L_0x0071:
        r4 = android.os.Build.VERSION.SDK_INT;
        if (r4 >= r2) goto L_0x007e;
    L_0x0075:
        r2 = r11.b;
        r2 = r2.g;
        if (r2 != 0) goto L_0x007c;
    L_0x007b:
        goto L_0x007e;
    L_0x007c:
        r2 = 1;
        goto L_0x007f;
    L_0x007e:
        r2 = 0;
    L_0x007f:
        r4 = r11.b;
        r4 = r4.h;
        r5 = 2131755841; // 0x7f100341 float:1.9142573E38 double:1.0532273264E-314;
        r9 = 8;
        if (r4 == 0) goto L_0x0093;
    L_0x008a:
        r7.setTextViewText(r5, r4);
        r7.setViewVisibility(r5, r8);
        r12 = 1;
        r10 = 1;
        goto L_0x0097;
    L_0x0093:
        r7.setViewVisibility(r5, r9);
        r10 = r2;
    L_0x0097:
        r2 = r11.b;
        r2 = r2.k;
        if (r2 == 0) goto L_0x00db;
    L_0x009d:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 16;
        if (r2 < r3) goto L_0x00db;
    L_0x00a3:
        r2 = r11.b;
        r2 = r2.k;
        r7.setTextViewText(r1, r2);
        r2 = r11.b;
        r2 = r2.e;
        r4 = 2131755183; // 0x7f1000af float:1.9141238E38 double:1.0532270013E-314;
        if (r2 == 0) goto L_0x00d8;
    L_0x00b3:
        r7.setTextViewText(r4, r2);
        r7.setViewVisibility(r4, r8);
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 >= r3) goto L_0x00be;
    L_0x00bd:
        goto L_0x00db;
    L_0x00be:
        if (r13 != 0) goto L_0x00c1;
    L_0x00c0:
        goto L_0x00cc;
    L_0x00c1:
        r13 = 2131625971; // 0x7f0e07f3 float:1.8879165E38 double:1.053163162E-314;
        r13 = r0.getDimensionPixelSize(r13);
        r13 = (float) r13;
        r7.setTextViewTextSize(r1, r8, r13);
    L_0x00cc:
        r2 = 2131755114; // 0x7f10006a float:1.9141098E38 double:1.053226967E-314;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r1 = r7;
        r1.setViewPadding(r2, r3, r4, r5, r6);
        goto L_0x00db;
    L_0x00d8:
        r7.setViewVisibility(r4, r9);
    L_0x00db:
        r13 = r11.b;
        r0 = r13.f();
        r2 = 0;
        r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r13 == 0) goto L_0x00fa;
    L_0x00e7:
        r13 = 2131757395; // 0x7f100953 float:1.9145725E38 double:1.053228094E-314;
        r7.setViewVisibility(r13, r8);
        r0 = r11.b;
        r0 = r0.f();
        r2 = "setTime";
        r7.setLong(r13, r2, r0);
    L_0x00f8:
        r13 = 0;
        goto L_0x00fe;
    L_0x00fa:
        if (r10 != 0) goto L_0x00f8;
    L_0x00fc:
        r13 = 8;
    L_0x00fe:
        r0 = 2131757738; // 0x7f100aaa float:1.914642E38 double:1.0532282636E-314;
        r7.setViewVisibility(r0, r13);
        if (r12 != 0) goto L_0x0108;
    L_0x0106:
        r8 = 8;
    L_0x0108:
        r12 = 2131755115; // 0x7f10006b float:1.91411E38 double:1.0532269677E-314;
        r7.setViewVisibility(r12, r8);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj.a(int, boolean):android.widget.RemoteViews");
    }

    public final void a(RemoteViews remoteViews, RemoteViews remoteViews2) {
        remoteViews.setViewVisibility(R.id.title, 8);
        remoteViews.setViewVisibility(R.id.text2, 8);
        remoteViews.setViewVisibility(R.id.text, 8);
        remoteViews.removeAllViews(R.id.notification_main_column);
        remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
        remoteViews.setViewVisibility(R.id.notification_main_column, 0);
        if (VERSION.SDK_INT >= 21) {
            Resources resources = this.b.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float f = resources.getConfiguration().fontScale;
            if (f < 1.0f) {
                f = 1.0f;
            } else if (f > 1.3f) {
                f = 1.3f;
            }
            f = (f - 4.0f) / 0.29999995f;
            remoteViews.setViewPadding(R.id.notification_main_column_container, 0, Math.round(((1.0f - f) * ((float) dimensionPixelSize)) + (f * ((float) dimensionPixelSize2))), 0, 0);
        }
    }
}
