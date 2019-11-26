package defpackage;

import com.google.android.youtube.R;

/* renamed from: gdi */
final /* synthetic */ class gdi implements Runnable {
    private final gdf a;

    gdi(gdf gdf) {
        this.a = gdf;
    }

    public final void run() {
        gdf gdf = this.a;
        gdf.o.setEnabled(true);
        gdf.o.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.quantum_ic_get_app_white_24, 0, 0);
    }
}
