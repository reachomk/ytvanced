package defpackage;

import android.os.Bundle;
import android.speech.RecognitionListener;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: adxq */
final class adxq implements RecognitionListener {
    private final /* synthetic */ adxn a;

    adxq(adxn adxn) {
        this.a = adxn;
    }

    public final void onBufferReceived(byte[] bArr) {
    }

    public final void onEvent(int i, Bundle bundle) {
    }

    public final void onReadyForSpeech(Bundle bundle) {
        adxn adxn = this.a;
        adxn.d = null;
        adxn.e = null;
        adxn.f = null;
        adxn.g = null;
    }

    public final void onBeginningOfSpeech() {
        this.a.b.c();
        this.a.c();
    }

    public final void onRmsChanged(float f) {
        this.a.b.a(f);
    }

    public final void onEndOfSpeech() {
        this.a.b.d();
    }

    public final void onError(int i) {
        xtl.a(adxn.a, "Speech recognition error", new adxr(i));
        this.a.b();
        this.a.b.a(i);
    }

    public final void onResults(Bundle bundle) {
        String f;
        this.a.d();
        ArrayList stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.isEmpty() || TextUtils.isEmpty((CharSequence) stringArrayList.get(0))) {
            f = this.a.f();
        } else {
            f = (String) stringArrayList.get(0);
        }
        this.a.b.a(f);
        this.a.a();
    }

    /* JADX WARNING: Missing block: B:14:0x0047, code skipped:
            if (defpackage.amqq.a(r0.g, r0.f) == false) goto L_0x0049;
     */
    public final void onPartialResults(android.os.Bundle r3) {
        /*
        r2 = this;
        r0 = "results_recognition";
        r0 = r3.getStringArrayList(r0);
        r1 = "android.speech.extra.UNSTABLE_TEXT";
        r3 = r3.getStringArrayList(r1);
        if (r3 != 0) goto L_0x000f;
    L_0x000e:
        goto L_0x001d;
    L_0x000f:
        r1 = r3.isEmpty();
        if (r1 != 0) goto L_0x001d;
    L_0x0015:
        r1 = 0;
        r3 = r3.get(r1);
        r3 = (java.lang.String) r3;
        goto L_0x001f;
    L_0x001d:
        r3 = "";
    L_0x001f:
        if (r0 == 0) goto L_0x0027;
    L_0x0021:
        r1 = r0.isEmpty();
        if (r1 == 0) goto L_0x002d;
    L_0x0027:
        r1 = android.text.TextUtils.isEmpty(r3);
        if (r1 != 0) goto L_0x0074;
    L_0x002d:
        r1 = r2.a;
        r1.d = r0;
        r1.f = r3;
        r0 = r1.e;
        r1 = r1.d;
        r0 = defpackage.amqq.a(r0, r1);
        if (r0 == 0) goto L_0x0049;
    L_0x003d:
        r0 = r2.a;
        r1 = r0.g;
        r0 = r0.f;
        r0 = defpackage.amqq.a(r1, r0);
        if (r0 != 0) goto L_0x0074;
    L_0x0049:
        r0 = r2.a;
        r0 = r0.e();
        r0 = r0.toString();
        r0 = r0.trim();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x0063;
    L_0x005d:
        r1 = android.text.TextUtils.isEmpty(r3);
        if (r1 != 0) goto L_0x006a;
    L_0x0063:
        r1 = r2.a;
        r1 = r1.b;
        r1.a(r0, r3);
    L_0x006a:
        r3 = r2.a;
        r0 = r3.d;
        r3.e = r0;
        r0 = r3.f;
        r3.g = r0;
    L_0x0074:
        r3 = r2.a;
        r3.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adxq.onPartialResults(android.os.Bundle):void");
    }
}
