package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ueu */
public final class ueu implements Externalizable {
    public static final long serialVersionUID = 1;
    public String a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    private boolean d;
    private boolean e;
    private String f;

    public ueu() {
        String str = "";
        this.a = str;
        this.f = str;
    }

    public final int a() {
        return this.b.size();
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            objectOutput.writeUTF(this.a);
        }
        int a = a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            objectOutput.writeInt(((Integer) this.b.get(i)).intValue());
        }
        a = this.c.size();
        objectOutput.writeInt(a);
        for (int i2 = 0; i2 < a; i2++) {
            objectOutput.writeInt(((Integer) this.c.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
    }

    public final void readExternal(ObjectInput objectInput) {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.d = true;
            this.a = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.b.add(Integer.valueOf(objectInput.readInt()));
        }
        readInt = objectInput.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            this.c.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.e = true;
            this.f = readUTF2;
        }
    }
}
