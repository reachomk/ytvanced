package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: altx */
final /* synthetic */ class altx implements amqd {
    private final altr a;
    private final altm b;

    altx(altr altr, altm altm) {
        this.a = altr;
        this.b = altm;
    }

    public final Object a(Object obj) {
        altr altr = this.a;
        altm altm = this.b;
        byte[] bArr = (byte[]) obj;
        altr.a();
        String str = altr.a;
        int andIncrement = altr.c.getAndIncrement();
        StringBuilder stringBuilder = new StringBuilder(15);
        stringBuilder.append(andIncrement);
        stringBuilder.append(".tmp");
        File file = new File(str, stringBuilder.toString());
        try {
            File file2 = new File(altr.a, alud.a(altm));
            anbk.c(file);
            anbk.a(file, anbh.a).a(bArr);
            anbk.c(file2);
            if (file.exists()) {
                List arrayList = new ArrayList();
                arrayList.add("mv");
                arrayList.add(file.getAbsolutePath());
                arrayList.add(file2.getAbsolutePath());
                altr.a(arrayList);
            }
            return null;
        } catch (IOException e) {
            altr.a(new alts(file));
            altr.a();
            String valueOf = String.valueOf(altm);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 45);
            stringBuilder2.append("Unexpected error when writing the value for: ");
            stringBuilder2.append(valueOf);
            throw new RuntimeException(stringBuilder2.toString(), e);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            String valueOf2 = String.valueOf(altm);
            StringBuilder stringBuilder3 = new StringBuilder(valueOf2.length() + 60);
            stringBuilder3.append("Unexpected error occurred while trying to persist data for: ");
            stringBuilder3.append(valueOf2);
            throw new RuntimeException(stringBuilder3.toString());
        }
    }
}
