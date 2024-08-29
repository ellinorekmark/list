"use strict";(self.webpackChunklistig_react_ui=self.webpackChunklistig_react_ui||[]).push([[825],{6879:(e,t,o)=>{o.d(t,{A:()=>r});var a=o(9217);class r{constructor(){this.baseUrl=a.C1}async sendPost(e,t,o){const a=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json",Authorization:"Basic "+o},body:JSON.stringify(t)});if(!a.ok){console.log(await a.json());const e=await a.json();throw new Error(e)}return await a.json()}async sendPostNoLogin(e,t){const o=await fetch(this.baseUrl+e,{method:"POST",headers:{"Content-Type":"application/json"},body:JSON.stringify(t)});if(!o.ok){const e=await o.json();throw new Error(e)}return await o.json()}async sendGet(e,t){const o=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json",Authorization:"Basic "+t}});if(!o.ok)throw new Error(await o.json());return await o.json()}async sendGetNoAuth(e){const t=await fetch(this.baseUrl+e,{method:"GET",headers:{"Content-Type":"application/json"}});if(!t.ok)throw new Error(await t.json());return await t.json()}async sendDelete(e,t,o){const a=await fetch(this.baseUrl+e,{method:"DELETE",headers:{"Content-Type":"application/json",Authorization:"Basic "+o},body:JSON.stringify(t)});if(!a.ok)throw new Error(await a.json());return await a.json()}}},9007:(e,t,o)=>{o.d(t,{A:()=>i});var a=o(5865),r=o(6446),n=(o(5043),o(579));const i=e=>{let{title:t}=e;return(0,n.jsx)(n.Fragment,{children:(0,n.jsxs)(r.A,{sx:{paddingTop:2,paddingRight:5,paddingLeft:5},children:[(0,n.jsx)(a.A,{fontSize:"xx-large",sx:{fontFamily:"Garamond",color:"primary.main"},children:(0,n.jsx)("strong",{children:t})}),(0,n.jsx)("br",{})]})})}},2825:(e,t,o)=>{o.r(t),o.d(t,{default:()=>K});var a=o(5043),r=o(5146),n=o(3193),i=o(5865),s=o(9285),l=o(6990),c=o(1637),d=o(8587),p=o(8168),u=o(8387),m=o(8606),h=o(7266),v=o(4535),g=o(8206),A=o(4162),f=o(6803),x=o(3336),y=o(7056),b=o(2400);function w(e){return(0,b.Ay)("MuiAlert",e)}const C=(0,y.A)("MuiAlert",["root","action","icon","message","filled","colorSuccess","colorInfo","colorWarning","colorError","filledSuccess","filledInfo","filledWarning","filledError","outlined","outlinedSuccess","outlinedInfo","outlinedWarning","outlinedError","standard","standardSuccess","standardInfo","standardWarning","standardError"]);var j=o(7392),S=o(9662),k=o(579);const M=(0,S.A)((0,k.jsx)("path",{d:"M20,12A8,8 0 0,1 12,20A8,8 0 0,1 4,12A8,8 0 0,1 12,4C12.76,4 13.5,4.11 14.2, 4.31L15.77,2.74C14.61,2.26 13.34,2 12,2A10,10 0 0,0 2,12A10,10 0 0,0 12,22A10,10 0 0, 0 22,12M7.91,10.08L6.5,11.5L11,16L21,6L19.59,4.58L11,13.17L7.91,10.08Z"}),"SuccessOutlined"),I=(0,S.A)((0,k.jsx)("path",{d:"M12 5.99L19.53 19H4.47L12 5.99M12 2L1 21h22L12 2zm1 14h-2v2h2v-2zm0-6h-2v4h2v-4z"}),"ReportProblemOutlined"),z=(0,S.A)((0,k.jsx)("path",{d:"M11 15h2v2h-2zm0-8h2v6h-2zm.99-5C6.47 2 2 6.48 2 12s4.47 10 9.99 10C17.52 22 22 17.52 22 12S17.52 2 11.99 2zM12 20c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"}),"ErrorOutline"),L=(0,S.A)((0,k.jsx)("path",{d:"M11,9H13V7H11M12,20C7.59,20 4,16.41 4,12C4,7.59 7.59,4 12,4C16.41,4 20,7.59 20, 12C20,16.41 16.41,20 12,20M12,2A10,10 0 0,0 2,12A10,10 0 0,0 12,22A10,10 0 0,0 22,12A10, 10 0 0,0 12,2M11,17H13V11H11V17Z"}),"InfoOutlined"),R=(0,S.A)((0,k.jsx)("path",{d:"M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z"}),"Close"),O=["action","children","className","closeText","color","components","componentsProps","icon","iconMapping","onClose","role","severity","slotProps","slots","variant"],T=(0,v.Ay)(x.A,{name:"MuiAlert",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:o}=e;return[t.root,t[o.variant],t["".concat(o.variant).concat((0,f.A)(o.color||o.severity))]]}})((e=>{let{theme:t}=e;const o="light"===t.palette.mode?h.e$:h.a,a="light"===t.palette.mode?h.a:h.e$;return(0,p.A)({},t.typography.body2,{backgroundColor:"transparent",display:"flex",padding:"6px 16px",variants:[...Object.entries(t.palette).filter((e=>{let[,t]=e;return t.main&&t.light})).map((e=>{let[r]=e;return{props:{colorSeverity:r,variant:"standard"},style:{color:t.vars?t.vars.palette.Alert["".concat(r,"Color")]:o(t.palette[r].light,.6),backgroundColor:t.vars?t.vars.palette.Alert["".concat(r,"StandardBg")]:a(t.palette[r].light,.9),["& .".concat(C.icon)]:t.vars?{color:t.vars.palette.Alert["".concat(r,"IconColor")]}:{color:t.palette[r].main}}}})),...Object.entries(t.palette).filter((e=>{let[,t]=e;return t.main&&t.light})).map((e=>{let[a]=e;return{props:{colorSeverity:a,variant:"outlined"},style:{color:t.vars?t.vars.palette.Alert["".concat(a,"Color")]:o(t.palette[a].light,.6),border:"1px solid ".concat((t.vars||t).palette[a].light),["& .".concat(C.icon)]:t.vars?{color:t.vars.palette.Alert["".concat(a,"IconColor")]}:{color:t.palette[a].main}}}})),...Object.entries(t.palette).filter((e=>{let[,t]=e;return t.main&&t.dark})).map((e=>{let[o]=e;return{props:{colorSeverity:o,variant:"filled"},style:(0,p.A)({fontWeight:t.typography.fontWeightMedium},t.vars?{color:t.vars.palette.Alert["".concat(o,"FilledColor")],backgroundColor:t.vars.palette.Alert["".concat(o,"FilledBg")]}:{backgroundColor:"dark"===t.palette.mode?t.palette[o].dark:t.palette[o].main,color:t.palette.getContrastText(t.palette[o].main)})}}))]})})),N=(0,v.Ay)("div",{name:"MuiAlert",slot:"Icon",overridesResolver:(e,t)=>t.icon})({marginRight:12,padding:"7px 0",display:"flex",fontSize:22,opacity:.9}),P=(0,v.Ay)("div",{name:"MuiAlert",slot:"Message",overridesResolver:(e,t)=>t.message})({padding:"8px 0",minWidth:0,overflow:"auto"}),B=(0,v.Ay)("div",{name:"MuiAlert",slot:"Action",overridesResolver:(e,t)=>t.action})({display:"flex",alignItems:"flex-start",padding:"4px 0 0 16px",marginLeft:"auto",marginRight:-8}),E={success:(0,k.jsx)(M,{fontSize:"inherit"}),warning:(0,k.jsx)(I,{fontSize:"inherit"}),error:(0,k.jsx)(z,{fontSize:"inherit"}),info:(0,k.jsx)(L,{fontSize:"inherit"})},F=a.forwardRef((function(e,t){const o=(0,g.b)({props:e,name:"MuiAlert"}),{action:a,children:r,className:n,closeText:i="Close",color:s,components:l={},componentsProps:c={},icon:h,iconMapping:v=E,onClose:x,role:y="alert",severity:b="success",slotProps:C={},slots:S={},variant:M="standard"}=o,I=(0,d.A)(o,O),z=(0,p.A)({},o,{color:s,severity:b,variant:M,colorSeverity:s||b}),L=(e=>{const{variant:t,color:o,severity:a,classes:r}=e,n={root:["root","color".concat((0,f.A)(o||a)),"".concat(t).concat((0,f.A)(o||a)),"".concat(t)],icon:["icon"],message:["message"],action:["action"]};return(0,m.A)(n,w,r)})(z),F={slots:(0,p.A)({closeButton:l.CloseButton,closeIcon:l.CloseIcon},S),slotProps:(0,p.A)({},c,C)},[W,G]=(0,A.A)("closeButton",{elementType:j.A,externalForwardedProps:F,ownerState:z}),[V,H]=(0,A.A)("closeIcon",{elementType:R,externalForwardedProps:F,ownerState:z});return(0,k.jsxs)(T,(0,p.A)({role:y,elevation:0,ownerState:z,className:(0,u.A)(L.root,n),ref:t},I,{children:[!1!==h?(0,k.jsx)(N,{ownerState:z,className:L.icon,children:h||v[b]||E[b]}):null,(0,k.jsx)(P,{ownerState:z,className:L.message,children:r}),null!=a?(0,k.jsx)(B,{ownerState:z,className:L.action,children:a}):null,null==a&&x?(0,k.jsx)(B,{ownerState:z,className:L.action,children:(0,k.jsx)(W,(0,p.A)({size:"small","aria-label":i,title:i,color:"inherit",onClick:x},G,{children:(0,k.jsx)(V,(0,p.A)({fontSize:"small"},H))}))}):null]}))}));var W=o(6446),G=o(1906),V=o(9613),H=o(6879),D=o(835),U=o(9007);const X=new H.A,K=()=>{const{loginDetails:e,user:t}=(0,a.useContext)(V.c),[o,d]=(0,a.useState)(""),[p,u]=(0,a.useState)("BASIC"),[m,h]=(0,a.useState)(""),[v,g]=(0,a.useState)(!1),[A,f]=(0,a.useState)(!1),[x,y]=(0,a.useState)(!1),b=(0,D.Zp)();return(0,k.jsx)(k.Fragment,{children:(0,k.jsxs)(W.A,{maxWidth:750,sx:{mx:"auto"},variant:"contained",children:[(0,k.jsx)(U.A,{title:"New List"}),(0,k.jsx)("br",{}),(0,k.jsx)(W.A,{children:(0,k.jsxs)(W.A,{maxWidth:300,sx:{mx:"auto",mt:2,p:2,border:"1px solid ",borderColor:"primary.darker"},children:[(0,k.jsx)(r.A,{inputProps:{maxLength:100},id:"list-title",label:"Title",variant:"outlined",value:o,onChange:e=>d(e.target.value),fullWidth:!0,sx:{marginBottom:1},error:v,helperText:v?"Title is required":""}),(0,k.jsx)(r.A,{inputProps:{maxLength:100},id:"list-desc",label:"Description (optional)",variant:"outlined",value:m,onChange:e=>h(e.target.value),fullWidth:!0,sx:{marginBottom:1}}),(0,k.jsxs)(n.A,{children:[(0,k.jsx)(i.A,{children:"List type:"}),(0,k.jsxs)(s.A,{value:p,onChange:e=>{u(e.target.value)},sx:{width:200,marginBottom:2},children:[(0,k.jsx)(l.A,{value:"BASIC",children:"Normal"}),(0,k.jsx)(l.A,{value:"CHECK",children:"Checklist"}),(0,k.jsx)(l.A,{value:"LINK",children:"Linked"})]})]}),(0,k.jsx)("br",{}),(()=>{switch(p){case"BASIC":return"Normal, no-frills list.";case"CHECK":return"To do list, for accomplishing tasks.";case"LINK":return"Linked lists, add URL links to all your items."}})(),A?(0,k.jsx)(W.A,{sx:{display:"flex",justifyContent:"center",mt:4},children:(0,k.jsx)(c.A,{})}):(0,k.jsx)(G.A,{fullWidth:!0,variant:"outlined",sx:{mt:1,p:1},onClick:async function(){if(""===o.trim())return void g(!0);g(!1),f(!0);const a={listInfo:{listName:o.trim(),listDesc:m.trim(),type:p},owner:t.username,editors:[],viewers:[],items:[]};try{const t=(await X.sendPost("list",a,e)).listInfo.id;b("/web/list/".concat(t))}catch(r){y(!0),f(!1)}},children:"Create"}),x?(0,k.jsx)(F,{severity:"error",children:"Failed to create list. Please try again later."}):(0,k.jsx)(W.A,{})]})})]})})}},7392:(e,t,o)=>{o.d(t,{A:()=>y});var a=o(8587),r=o(8168),n=o(5043),i=o(8387),s=o(8606),l=o(7266),c=o(4535),d=o(8206),p=o(6236),u=o(6803),m=o(7056),h=o(2400);function v(e){return(0,h.Ay)("MuiIconButton",e)}const g=(0,m.A)("MuiIconButton",["root","disabled","colorInherit","colorPrimary","colorSecondary","colorError","colorInfo","colorSuccess","colorWarning","edgeStart","edgeEnd","sizeSmall","sizeMedium","sizeLarge"]);var A=o(579);const f=["edge","children","className","color","disabled","disableFocusRipple","size"],x=(0,c.Ay)(p.A,{name:"MuiIconButton",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:o}=e;return[t.root,"default"!==o.color&&t["color".concat((0,u.A)(o.color))],o.edge&&t["edge".concat((0,u.A)(o.edge))],t["size".concat((0,u.A)(o.size))]]}})((e=>{let{theme:t,ownerState:o}=e;return(0,r.A)({textAlign:"center",flex:"0 0 auto",fontSize:t.typography.pxToRem(24),padding:8,borderRadius:"50%",overflow:"visible",color:(t.vars||t).palette.action.active,transition:t.transitions.create("background-color",{duration:t.transitions.duration.shortest})},!o.disableRipple&&{"&:hover":{backgroundColor:t.vars?"rgba(".concat(t.vars.palette.action.activeChannel," / ").concat(t.vars.palette.action.hoverOpacity,")"):(0,l.X4)(t.palette.action.active,t.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:"transparent"}}},"start"===o.edge&&{marginLeft:"small"===o.size?-3:-12},"end"===o.edge&&{marginRight:"small"===o.size?-3:-12})}),(e=>{let{theme:t,ownerState:o}=e;var a;const n=null==(a=(t.vars||t).palette)?void 0:a[o.color];return(0,r.A)({},"inherit"===o.color&&{color:"inherit"},"inherit"!==o.color&&"default"!==o.color&&(0,r.A)({color:null==n?void 0:n.main},!o.disableRipple&&{"&:hover":(0,r.A)({},n&&{backgroundColor:t.vars?"rgba(".concat(n.mainChannel," / ").concat(t.vars.palette.action.hoverOpacity,")"):(0,l.X4)(n.main,t.palette.action.hoverOpacity)},{"@media (hover: none)":{backgroundColor:"transparent"}})}),"small"===o.size&&{padding:5,fontSize:t.typography.pxToRem(18)},"large"===o.size&&{padding:12,fontSize:t.typography.pxToRem(28)},{["&.".concat(g.disabled)]:{backgroundColor:"transparent",color:(t.vars||t).palette.action.disabled}})})),y=n.forwardRef((function(e,t){const o=(0,d.b)({props:e,name:"MuiIconButton"}),{edge:n=!1,children:l,className:c,color:p="default",disabled:m=!1,disableFocusRipple:h=!1,size:g="medium"}=o,y=(0,a.A)(o,f),b=(0,r.A)({},o,{edge:n,color:p,disabled:m,disableFocusRipple:h,size:g}),w=(e=>{const{classes:t,disabled:o,color:a,edge:r,size:n}=e,i={root:["root",o&&"disabled","default"!==a&&"color".concat((0,u.A)(a)),r&&"edge".concat((0,u.A)(r)),"size".concat((0,u.A)(n))]};return(0,s.A)(i,v,t)})(b);return(0,A.jsx)(x,(0,r.A)({className:(0,i.A)(w.root,c),centerRipple:!0,focusRipple:!h,disabled:m,ref:t},y,{ownerState:b,children:l}))}))},5671:(e,t,o)=>{o.d(t,{A:()=>i,b:()=>n});var a=o(7056),r=o(2400);function n(e){return(0,r.Ay)("MuiListItemText",e)}const i=(0,a.A)("MuiListItemText",["root","multiline","dense","inset","primary","secondary"])},6990:(e,t,o)=>{o.d(t,{A:()=>k});var a=o(8587),r=o(8168),n=o(5043),i=o(8387),s=o(8606),l=o(7266),c=o(4535),d=o(1475),p=o(8206),u=o(1347),m=o(6236),h=o(5013),v=o(5849),g=o(7056);const A=(0,g.A)("MuiDivider",["root","absolute","fullWidth","inset","middle","flexItem","light","vertical","withChildren","withChildrenVertical","textAlignRight","textAlignLeft","wrapper","wrapperVertical"]);const f=(0,g.A)("MuiListItemIcon",["root","alignItemsFlexStart"]);var x=o(5671),y=o(2400);function b(e){return(0,y.Ay)("MuiMenuItem",e)}const w=(0,g.A)("MuiMenuItem",["root","focusVisible","dense","disabled","divider","gutters","selected"]);var C=o(579);const j=["autoFocus","component","dense","divider","disableGutters","focusVisibleClassName","role","tabIndex","className"],S=(0,c.Ay)(m.A,{shouldForwardProp:e=>(0,d.A)(e)||"classes"===e,name:"MuiMenuItem",slot:"Root",overridesResolver:(e,t)=>{const{ownerState:o}=e;return[t.root,o.dense&&t.dense,o.divider&&t.divider,!o.disableGutters&&t.gutters]}})((e=>{let{theme:t,ownerState:o}=e;return(0,r.A)({},t.typography.body1,{display:"flex",justifyContent:"flex-start",alignItems:"center",position:"relative",textDecoration:"none",minHeight:48,paddingTop:6,paddingBottom:6,boxSizing:"border-box",whiteSpace:"nowrap"},!o.disableGutters&&{paddingLeft:16,paddingRight:16},o.divider&&{borderBottom:"1px solid ".concat((t.vars||t).palette.divider),backgroundClip:"padding-box"},{"&:hover":{textDecoration:"none",backgroundColor:(t.vars||t).palette.action.hover,"@media (hover: none)":{backgroundColor:"transparent"}},["&.".concat(w.selected)]:{backgroundColor:t.vars?"rgba(".concat(t.vars.palette.primary.mainChannel," / ").concat(t.vars.palette.action.selectedOpacity,")"):(0,l.X4)(t.palette.primary.main,t.palette.action.selectedOpacity),["&.".concat(w.focusVisible)]:{backgroundColor:t.vars?"rgba(".concat(t.vars.palette.primary.mainChannel," / calc(").concat(t.vars.palette.action.selectedOpacity," + ").concat(t.vars.palette.action.focusOpacity,"))"):(0,l.X4)(t.palette.primary.main,t.palette.action.selectedOpacity+t.palette.action.focusOpacity)}},["&.".concat(w.selected,":hover")]:{backgroundColor:t.vars?"rgba(".concat(t.vars.palette.primary.mainChannel," / calc(").concat(t.vars.palette.action.selectedOpacity," + ").concat(t.vars.palette.action.hoverOpacity,"))"):(0,l.X4)(t.palette.primary.main,t.palette.action.selectedOpacity+t.palette.action.hoverOpacity),"@media (hover: none)":{backgroundColor:t.vars?"rgba(".concat(t.vars.palette.primary.mainChannel," / ").concat(t.vars.palette.action.selectedOpacity,")"):(0,l.X4)(t.palette.primary.main,t.palette.action.selectedOpacity)}},["&.".concat(w.focusVisible)]:{backgroundColor:(t.vars||t).palette.action.focus},["&.".concat(w.disabled)]:{opacity:(t.vars||t).palette.action.disabledOpacity},["& + .".concat(A.root)]:{marginTop:t.spacing(1),marginBottom:t.spacing(1)},["& + .".concat(A.inset)]:{marginLeft:52},["& .".concat(x.A.root)]:{marginTop:0,marginBottom:0},["& .".concat(x.A.inset)]:{paddingLeft:36},["& .".concat(f.root)]:{minWidth:36}},!o.dense&&{[t.breakpoints.up("sm")]:{minHeight:"auto"}},o.dense&&(0,r.A)({minHeight:32,paddingTop:4,paddingBottom:4},t.typography.body2,{["& .".concat(f.root," svg")]:{fontSize:"1.25rem"}}))})),k=n.forwardRef((function(e,t){const o=(0,p.b)({props:e,name:"MuiMenuItem"}),{autoFocus:l=!1,component:c="li",dense:d=!1,divider:m=!1,disableGutters:g=!1,focusVisibleClassName:A,role:f="menuitem",tabIndex:x,className:y}=o,w=(0,a.A)(o,j),k=n.useContext(u.A),M=n.useMemo((()=>({dense:d||k.dense||!1,disableGutters:g})),[k.dense,d,g]),I=n.useRef(null);(0,h.A)((()=>{l&&I.current&&I.current.focus()}),[l]);const z=(0,r.A)({},o,{dense:M.dense,divider:m,disableGutters:g}),L=(e=>{const{disabled:t,dense:o,divider:a,disableGutters:n,selected:i,classes:l}=e,c={root:["root",o&&"dense",t&&"disabled",!n&&"gutters",a&&"divider",i&&"selected"]},d=(0,s.A)(c,b,l);return(0,r.A)({},l,d)})(o),R=(0,v.A)(I,t);let O;return o.disabled||(O=void 0!==x?x:-1),(0,C.jsx)(u.A.Provider,{value:M,children:(0,C.jsx)(S,(0,r.A)({ref:R,role:f,tabIndex:O,component:c,focusVisibleClassName:(0,i.A)(L.focusVisible,A),className:(0,i.A)(L.root,y)},w,{ownerState:z,classes:L}))})}))},4162:(e,t,o)=>{o.d(t,{A:()=>u});var a=o(8168),r=o(8587),n=o(7042),i=o(4430),s=o(8413),l=o(2205);const c=["className","elementType","ownerState","externalForwardedProps","getSlotOwnerState","internalForwardedProps"],d=["component","slots","slotProps"],p=["component"];function u(e,t){const{className:o,elementType:u,ownerState:m,externalForwardedProps:h,getSlotOwnerState:v,internalForwardedProps:g}=t,A=(0,r.A)(t,c),{component:f,slots:x={[e]:void 0},slotProps:y={[e]:void 0}}=h,b=(0,r.A)(h,d),w=x[e]||u,C=(0,i.Y)(y[e],m),j=(0,s.p)((0,a.A)({className:o},A,{externalForwardedProps:"root"===e?b:void 0,externalSlotProps:C})),{props:{component:S},internalRef:k}=j,M=(0,r.A)(j.props,p),I=(0,n.A)(k,null==C?void 0:C.ref,t.ref),z=v?v(M):{},L=(0,a.A)({},m,z),R="root"===e?S||f:S,O=(0,l.X)(w,(0,a.A)({},"root"===e&&!f&&!x[e]&&g,"root"!==e&&!x[e]&&g,M,R&&{as:R},{ref:I}),L);return Object.keys(z).forEach((e=>{delete O[e]})),[w,O]}}}]);
//# sourceMappingURL=825.b100f707.chunk.js.map