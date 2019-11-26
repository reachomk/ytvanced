package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kfn */
final /* synthetic */ class kfn implements akyx {
    private final kfk a;

    kfn(kfk kfk) {
        this.a = kfk;
    }

    public final Map a() {
        kfk kfk = this.a;
        HashMap hashMap = new HashMap(2);
        Bundle bundle = new Bundle();
        bundle.putBoolean("menu_as_bottom_sheet", true);
        hashMap.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        String str = "sectionListController";
        hashMap.put(str, kfk.a.a(str));
        return hashMap;
    }
}
