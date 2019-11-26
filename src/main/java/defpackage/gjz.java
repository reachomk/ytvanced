package defpackage;

import com.google.android.libraries.youtube.edit.ui.RoundedCornersEditText;

/* renamed from: gjz */
final /* synthetic */ class gjz implements Runnable {
    private final gju a;
    private final float b;
    private final String c;

    gjz(gju gju, float f, String str) {
        this.a = gju;
        this.b = f;
        this.c = str;
    }

    public final void run() {
        gju gju = this.a;
        float f = this.b;
        String str = this.c;
        gju.j.setTextSize(2, f);
        gju.j.setText(str);
        RoundedCornersEditText roundedCornersEditText = gju.j;
        roundedCornersEditText.setSelection(roundedCornersEditText.getText().length());
        gju.c();
    }
}
