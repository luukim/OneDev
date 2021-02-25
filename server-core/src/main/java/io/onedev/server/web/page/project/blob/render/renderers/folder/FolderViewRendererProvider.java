package io.onedev.server.web.page.project.blob.render.renderers.folder;

import org.apache.wicket.Component;

import io.onedev.server.web.PrioritizedComponentRenderer;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext;
import io.onedev.server.web.page.project.blob.render.BlobRendererContribution;
import io.onedev.server.web.page.project.blob.render.BlobRenderContext.Mode;

public class FolderViewRendererProvider implements BlobRendererContribution {

	private static final long serialVersionUID = 1L;

	@Override
	public PrioritizedComponentRenderer getRenderer(BlobRenderContext context) {
		if (context.getMode() == Mode.VIEW 
				&& context.getBlobIdent().revision != null 
				&& context.getBlobIdent().isTree()) {
			return new PrioritizedComponentRenderer() {
				
				private static final long serialVersionUID = 1L;

				@Override
				public Component render(String componentId) {
					return new FolderViewPanel(componentId, context);
				}

				@Override
				public int getPriority() {
					return 0;
				}
				
			};
		} else {
			return null;
		}
	}

}
