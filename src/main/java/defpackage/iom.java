package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;

/* renamed from: iom */
public final class iom extends wsk {
    public iom(nn nnVar, akzb akzb, aaas aaas, akvp akvp, akkq akkq, ViewGroup viewGroup) {
        super(nnVar, akzb, aaas, akvp, akkq, viewGroup);
        Bundle bundle = new Bundle();
        bundle.putBoolean("menu_as_bottom_sheet", true);
        this.a.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
    }
}
