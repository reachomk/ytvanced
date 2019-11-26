package defpackage;

/* renamed from: hou */
public final class hou implements aana {
    private final aamd a;
    private final hoc b;
    private final eki c;

    public hou(aamd aamd, hoc hoc, eki eki) {
        this.a = aamd;
        this.b = hoc;
        this.c = eki;
    }

    public final aaml a(ajtf ajtf) {
        if (ajtf.a().equals("DownloadsPageGenerationService.RecommendationsReload")) {
            return new hox("downloads_page_recommendations_item_section_identifier", (aqxy) aqxw.c.createBuilder(), this.a);
        }
        aqxy aqxy = (aqxy) aqxw.c.createBuilder();
        aqxy.a(hss.a(ajtf));
        return new hox("downloads_page_downloads_item_section_identifier", aqxy, this.a);
    }

    public final void a(aaml aaml, aand aand, afsw afsw) {
        if (aaml instanceof hox) {
            hox hox = (hox) aaml;
            hoc hoc = this.b;
            eki eki = this.c;
            int a = aqxx.a(((aqxw) hox.b.instance).b);
            if (a == 0) {
                a = 1;
            }
            afsw.a(new how(hox.a, hoc.a(eki, a)));
        }
    }
}
