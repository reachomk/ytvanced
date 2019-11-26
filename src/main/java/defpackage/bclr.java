package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bclr */
public abstract class bclr extends bcjh {
    public abstract bcjf a(String str, bcix bcix, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3);

    public abstract bcom a(String str, bckz bckz, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, bckr bckr);

    public final /* synthetic */ bckw a(String str, bckz bckz, Executor executor) {
        return new bcop(str, bckz, executor, this);
    }
}
