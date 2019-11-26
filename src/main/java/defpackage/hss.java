package defpackage;

/* renamed from: hss */
public final class hss {
    public static awzv a(int i) {
        int i2 = i - 1;
        if (i != 0) {
            String str = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : "DownloadsPageGenerationService.FilterTypeVideosContinuationToken" : "DownloadsPageGenerationService.FilterTypePlaylistsContinuationToken" : "DownloadsPageGenerationService.FilterTypeNoneContinuationToken";
            if (amqu.a(str)) {
                return null;
            }
            awzu awzu = (awzu) awzv.d.createBuilder();
            awzu.a(str);
            return (awzv) ((anxl) awzu.build());
        }
        throw null;
    }

    public static int a(ajtf ajtf) {
        int i;
        String a = ajtf.a();
        if ("DownloadsPageGenerationService.FilterTypeNoneContinuationToken".equals(a)) {
            i = 2;
        } else if ("DownloadsPageGenerationService.FilterTypePlaylistsContinuationToken".equals(a)) {
            i = 3;
        } else if ("DownloadsPageGenerationService.FilterTypeVideosContinuationToken".equals(a)) {
            return 4;
        } else {
            i = 1;
        }
        return i;
    }
}
