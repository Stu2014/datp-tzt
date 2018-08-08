<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="comm/include.inc.jsp"%>
<h2 class="contentTitle">修改奖品信息</h2>

<div class="pageContent">

	<form method="post" action="ssadmin/updateLotteryaward.html"
		class="pageForm required-validate" enctype="multipart/form-data"
		onsubmit="return iframeCallback(this, dialogAjaxDone);">
		<div class="pageFormContent nowrap" layoutH="97">
			<dl>
				<dt>奖品类型：</dt>
				<dd>
					<select type="combox" name="ftype" class="required">
						<c:forEach items="${map}" var="type">
							<c:if test="${type.key == lotteryaward.type}">
								<option value="${type.key}" selected="true">${type.value}</option>
							</c:if>
							<c:if test="${type.key != lotteryaward.type}">
								<option value="${type.key}">${type.value}</option>
							</c:if>
						</c:forEach>
					</select>
				</dd>
			</dl>
			<dt>虚拟币名称：</dt>
				<dd>
					<select
						type="combox" name="vid" class="required">
						<c:forEach items="${typeMap}" var="type">
							<c:if test="${type.key == lotteryaward.fvirtualcointypeId}">
								<option value="${type.key}" selected="true">${type.value}</option>
							</c:if>
							<c:if test="${type.key != lotteryaward.fvirtualcointypeId}">
								<option value="${type.key}">${type.value}</option>
							</c:if>
						</c:forEach>
					</select>
				</dd>
			</dl>
			<dl>
				<dt>奖品名称：</dt>
				<dd>
					<input type="hidden" name="fid" value="${lotteryaward.fid }" /> <input
						type="text" name="fname" class="required" size="70"
						value="${lotteryaward.fname }" />
				</dd>
			</dl>
			<!-- <dl>
				<dt>图片链接：</dt>
				<dd>
					<input type="file" class="inputStyle" value="" name="filedata"
						id="filedata" /><span>90*90</span>
				</dd>
			</dl> -->
			<dl>
				<dt>奖品数量：</dt>
				<dd>
					<input type="text" name="fqty" class="required number"
						value="${lotteryaward.count }" />
				</dd>
			</dl>
			<dl>
				<dt>单位：</dt>
				<dd>
					<input type="text" name="funit" class="required" value="${lotteryaward.funit }" />
				</dd>
			</dl>
			<dl>
				<dt>中奖概率：</dt>
				<dd>
					<input type="text" name="fchance" class="required number"
						value="<fmt:formatNumber value="${lotteryaward.fchance }"  pattern="##.##" maxIntegerDigits="10" maxFractionDigits="10"/>" />
						<span>%</span>
				</dd>
			</dl>
			<%-- <dl>
				<dt>奖品位置：</dt>
				<dd>
					<input type="text" name="fangle" class="required number"  value="${lotteryaward.fangle }"/>
				</dd>
			</dl> --%>
			<dl>
				<dt>奖品剩余总数量：</dt>
				<dd>
					<input type="text" name="ftotal" class="required number" value="${lotteryaward.ftotal }"/>
				</dd>
			</dl>
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">保存</button>
						</div>
					</div>
				</li>
				<li><div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</form>

</div>


<script type="text/javascript">
function customvalidXxx(element){
	if ($(element).val() == "xxx") return false;
	return true;
}
</script>
