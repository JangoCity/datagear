/*
 * Copyright (c) 2018 datagear.tech. All Rights Reserved.
 */

/**
 * 
 */
package org.datagear.management.service;

import org.datagear.analysis.support.html.HtmlRenderContext;
import org.datagear.analysis.support.html.HtmlTplDashboardWidget;
import org.datagear.analysis.support.html.HtmlTplDashboardWidgetRenderer;
import org.datagear.management.domain.HtmlTplDashboardWidgetEntity;

/**
 * {@linkplain HtmlTplDashboardWidgetEntity}业务服务接口。
 * 
 * @author datagear@163.com
 *
 */
public interface HtmlTplDashboardWidgetEntityService
		extends DataPermissionEntityService<String, HtmlTplDashboardWidgetEntity>
{
	/**
	 * 获取渲染器。
	 * 
	 * @return
	 */
	HtmlTplDashboardWidgetRenderer<HtmlRenderContext> getHtmlTplDashboardWidgetRenderer();

	/**
	 * 获取可用于执行分析的{@linkplain HtmlTplDashboardWidget}。
	 * 
	 * @param id
	 * @return
	 */
	HtmlTplDashboardWidget<HtmlRenderContext> getHtmlTplDashboardWidget(String id);
}
