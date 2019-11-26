package com.google.android.libraries.youtube.comment.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.apcn;
import defpackage.wjw;
import defpackage.xwe;
import java.util.ArrayList;
import java.util.List;

public class BackstagePollEditorView extends LinearLayout {
    public wjw a;
    public apcn b;
    public TextView c;
    private int d;
    private int e;

    public BackstagePollEditorView(Context context) {
        super(context);
        a(context);
    }

    public BackstagePollEditorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public BackstagePollEditorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        setOrientation(1);
        setGravity(8388611);
        this.d = xwe.a(context, R.attr.ytTextSecondary, 0);
        this.e = getResources().getColor(R.color.quantum_googred500);
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount() - 1; i++) {
            arrayList.add(((EditText) getChildAt(i).findViewById(R.id.option_text)).getText().toString().trim());
        }
        return arrayList;
    }

    public final void b() {
        removeAllViews();
        this.c = null;
    }

    public final void a(int i, TextView textView) {
        CharSequence stringBuilder;
        if (i > 0) {
            int i2 = this.b.g;
            StringBuilder stringBuilder2 = new StringBuilder(25);
            stringBuilder2.append(i);
            stringBuilder2.append(" / ");
            stringBuilder2.append(i2);
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        textView.setText(stringBuilder);
        if (i <= this.b.g) {
            i = this.d;
        } else {
            i = this.e;
        }
        textView.setTextColor(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    public final void a(java.lang.String r6) {
        /*
        r5 = this;
        r0 = r5.getChildCount();
        r1 = 0;
        if (r0 <= 0) goto L_0x000e;
    L_0x0007:
        r0 = r5.c;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        goto L_0x000e;
    L_0x000c:
        r0 = 1;
        goto L_0x000f;
    L_0x000e:
        r0 = 0;
    L_0x000f:
        r2 = "The create option button must be added to the view before adding options";
        defpackage.amqw.b(r0, r2);
        r0 = r5.getChildCount();
        r0 = r0 + -1;
        r2 = r5.b;
        r2 = r2.e;
        if (r0 >= r2) goto L_0x00d5;
    L_0x0020:
        r0 = r5.getContext();
        r0 = android.view.LayoutInflater.from(r0);
        r2 = 2131034223; // 0x7f05006f float:1.7678957E38 double:1.0528707997E-314;
        r0 = r0.inflate(r2, r5, r1);
        r2 = 2131755650; // 0x7f100282 float:1.9142185E38 double:1.053227232E-314;
        r2 = r0.findViewById(r2);
        r3 = 2131755652; // 0x7f100284 float:1.914219E38 double:1.053227233E-314;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131755651; // 0x7f100283 float:1.9142187E38 double:1.0532272325E-314;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.EditText) r4;
        r4.setText(r6);
        r6 = r6.length();
        r5.a(r6, r3);
        r6 = new wju;
        r6.<init>(r5, r0);
        r2.setOnClickListener(r6);
        r6 = r5.b;
        r2 = r6.a;
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x0069;
    L_0x0062:
        r6 = r6.c;
        if (r6 != 0) goto L_0x006a;
    L_0x0066:
        r6 = defpackage.arml.f;
        goto L_0x006a;
    L_0x0069:
        r6 = 0;
    L_0x006a:
        r6 = defpackage.ajqy.a(r6);
        r2 = android.text.TextUtils.isEmpty(r6);
        if (r2 != 0) goto L_0x0077;
    L_0x0074:
        r4.setHint(r6);
    L_0x0077:
        r6 = r5.b;
        r6 = r6.g;
        if (r6 <= 0) goto L_0x0085;
    L_0x007d:
        r6 = new wjt;
        r6.<init>(r5, r3);
        r4.addTextChangedListener(r6);
    L_0x0085:
        r6 = r5.a();
        r6 = r6.iterator();
    L_0x008d:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x00bb;
    L_0x0093:
        r2 = r6.next();
        r2 = (java.lang.String) r2;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x008d;
    L_0x009f:
        r4.requestFocus();
        r6 = r5.getContext();
        r6 = defpackage.xrn.c(r6);
        if (r6 == 0) goto L_0x00bb;
    L_0x00ac:
        r6 = new android.os.Handler;
        r6.<init>();
        r2 = new wjr;
        r2.<init>(r4);
        r3 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r6.postDelayed(r2, r3);
    L_0x00bb:
        r6 = r5.getChildCount();
        r6 = r6 + -1;
        r5.addView(r0, r6);
        r6 = r5.getChildCount();
        r6 = r6 + -1;
        r0 = r5.b;
        r0 = r0.e;
        if (r6 < r0) goto L_0x00d5;
    L_0x00d0:
        r6 = r5.c;
        defpackage.xpr.a(r6, r1);
    L_0x00d5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.comment.ui.BackstagePollEditorView.a(java.lang.String):void");
    }
}
