package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* renamed from: aajk */
public final class aajk implements amro {
    public final Executor a;
    public final SharedPreferences b;
    public aajj c;

    public aajk(Executor executor, SharedPreferences sharedPreferences) {
        this.a = (Executor) amqw.a((Object) executor);
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0038 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|(4:7|8|9|10)|11|12|(1:14)) */
    /* renamed from: a */
    public final synchronized defpackage.aajj get() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x0046 }
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0042;
    L_0x0006:
        r0 = r4.b;	 Catch:{ all -> 0x0046 }
        r1 = "com.google.android.libraries.youtube.innertube.pref.player_config_supplier";
        r2 = 0;
        r0 = r0.getString(r1, r2);	 Catch:{ all -> 0x0046 }
        if (r0 == 0) goto L_0x0038;
    L_0x0011:
        r1 = 0;
        r0 = android.util.Base64.decode(r0, r1);	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r1 = defpackage.awdg.J;	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r1 = r1.createBuilder();	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r1 = (defpackage.awdf) r1;	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r3 = defpackage.anxa.c();	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r0 = r1.mergeFrom(r0, r3);	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r0 = (defpackage.anvi) r0;	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r0 = (defpackage.awdf) r0;	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r0 = r0.build();	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r0 = (defpackage.anxl) r0;	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r0 = (defpackage.awdg) r0;	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r1 = new aajj;	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r1.<init>(r0);	 Catch:{ anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038, anyg | IllegalArgumentException | NullPointerException -> 0x0038 }
        r2 = r1;
    L_0x0038:
        r4.c = r2;	 Catch:{ all -> 0x0046 }
        r0 = r4.c;	 Catch:{ all -> 0x0046 }
        if (r0 != 0) goto L_0x0042;
    L_0x003e:
        r0 = defpackage.aajj.b;	 Catch:{ all -> 0x0046 }
        r4.c = r0;	 Catch:{ all -> 0x0046 }
    L_0x0042:
        r0 = r4.c;	 Catch:{ all -> 0x0046 }
        monitor-exit(r4);
        return r0;
    L_0x0046:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aajk.get():aajj");
    }
}
