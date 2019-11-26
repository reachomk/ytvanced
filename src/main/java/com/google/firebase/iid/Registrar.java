package com.google.firebase.iid;

import defpackage.anlf;
import defpackage.annm;
import defpackage.annn;
import defpackage.annr;
import defpackage.anns;
import defpackage.anoq;
import defpackage.anpb;
import defpackage.anpe;
import defpackage.pzr;
import java.util.Arrays;
import java.util.List;

public final class Registrar implements anns {
    public final List getComponents() {
        annm a = annn.a(FirebaseInstanceId.class);
        a.a(annr.a(anlf.class));
        a.a(anpb.a);
        pzr.a(a.a == 0, (Object) "Instantiation type has already been set.");
        a.a = 1;
        annn a2 = a.a();
        annm a3 = annn.a(anoq.class);
        a3.a(annr.a(FirebaseInstanceId.class));
        a3.a(anpe.a);
        annn a4 = a3.a();
        return Arrays.asList(new annn[]{a2, a4});
    }
}
