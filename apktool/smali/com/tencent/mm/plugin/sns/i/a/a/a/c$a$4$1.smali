.class final Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic hfu:Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;


# direct methods
.method constructor <init>(Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;)V
    .locals 0

    .prologue
    .line 560
    iput-object p1, p0, Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4$1;->hfu:Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 563
    iget-object v0, p0, Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4$1;->hfu:Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;

    iget-object v0, v0, Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;->hfp:Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a;

    iget-object v1, p0, Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4$1;->hfu:Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;

    iget-object v1, v1, Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a$4;->hfr:Landroid/widget/ImageView;

    invoke-static {v0, v1}, Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a;->a(Lcom/tencent/mm/plugin/sns/i/a/a/a/c$a;Landroid/widget/ImageView;)V

    .line 564
    return-void
.end method
