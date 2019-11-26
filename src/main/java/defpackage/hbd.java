package defpackage;

import com.google.protos.youtube.api.innertube.SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand;
import java.util.Map;

/* renamed from: hbd */
public final class hbd implements aaap {
    private final hau a;

    public hbd(hau hau) {
        this.a = hau;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand.selectSuperStickerPackCommand);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand = (SelectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand) b;
        hau hau = this.a;
        String str = selectSuperStickerPackCommandOuterClass$SelectSuperStickerPackCommand.b;
        abrv abrv = hau.e.a;
        if (abrv != null) {
            abrv.a(str);
        }
    }
}
