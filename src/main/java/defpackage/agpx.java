package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agpx */
public final class agpx {
    public final String a;
    public final byte[] b;
    public final String c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final List g;
    public final String h;

    public agpx(String str, byte[] bArr, String str2, byte[] bArr2, String str3, long j, List list, String str4) {
        this(str, bArr, str2, bArr2, str3, j, list, str4, (byte) 0);
    }

    public agpx(String str, byte[] bArr, String str2, byte[] bArr2, String str3, long j, String str4, String str5) {
        CharSequence charSequence = str4;
        ArrayList arrayList = new ArrayList();
        try {
            for (String parseInt : amqz.a(',').a(charSequence)) {
                arrayList.add(Integer.valueOf(Integer.parseInt(parseInt)));
            }
        } catch (NumberFormatException e) {
            afpf afpf = afpf.offline;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str4).length() + 64);
            stringBuilder.append("Unable to convert '");
            stringBuilder.append(charSequence);
            stringBuilder.append("' to list of integer constants for OfflineDrm");
            afpc.a(2, afpf, stringBuilder.toString(), e);
        }
        this(str, bArr, str2, bArr2, str3, j, arrayList, str5, (byte) 0);
    }

    private agpx(String str, byte[] bArr, String str2, byte[] bArr2, String str3, long j, List list, String str4, byte b) {
        this.a = (String) amqw.a((Object) str);
        this.b = (byte[]) amqw.a((Object) bArr);
        this.c = (String) amqw.a((Object) str2);
        this.d = (byte[]) amqw.a((Object) bArr2);
        this.e = (String) amqw.a((Object) str3);
        this.f = j;
        this.g = list;
        this.h = str4;
    }
}
