package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.v;

final class SnsCommentDetailUI$32
  implements View.OnClickListener
{
  SnsCommentDetailUI$32(SnsCommentDetailUI paramSnsCommentDetailUI) {}
  
  public final void onClick(View paramView)
  {
    v.e("MicroMsg.SnsCommentDetailUI", "scrollTopClickListener");
    SnsCommentDetailUI.g(hrN);
    if (!SnsCommentDetailUI.a(hrN)) {
      return;
    }
    SnsCommentDetailUI.h(hrN);
  }
}

/* Location:
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.32
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */