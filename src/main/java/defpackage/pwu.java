package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: pwu */
public final class pwu {
    public static final Status a = new Status(8, "The connection to Google Play services was lost");
    public static final BasePendingResult[] b = new BasePendingResult[0];
    public final Set c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final Map d;
    private final pww e = new pwx(this);

    public pwu(Map map) {
        this.d = map;
    }

    /* Access modifiers changed, original: final */
    public final void a(BasePendingResult basePendingResult) {
        this.c.add(basePendingResult);
        basePendingResult.a(this.e);
    }
}
